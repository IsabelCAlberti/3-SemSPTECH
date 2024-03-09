package com.sptech.projeto04;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {

    private List<Medicamentos> medicamentos = new ArrayList<>();


    @GetMapping
    public List<Medicamentos> pegarNomeMedicamentos() {
        return medicamentos;
    }


    @PostMapping
    public String criarMedicamento(@RequestBody @Valid Medicamentos novoMedicamento) {
        medicamentos.add(novoMedicamento);
        if (novoMedicamento.getPrecisaReceita() == null) {
            novoMedicamento.setPrecisaReceita(false); // Valor padrão
        }
        return "Medicamento cadastrado com sucesso!";
    }

    @PatchMapping("/{indice}")
    @Validated
    public ResponseEntity<String> atualizarMedicamento(@PathVariable int indice, @RequestBody @Valid NovoMedicamento atualizacao) {
        if (indice >= 0 && indice < medicamentos.size()) {
            Medicamentos medicamento = medicamentos.get(indice);
            medicamento.setValorUnid(atualizacao.getNovoValorUnd());
            medicamento.setQuantidade(medicamento.getQuantidade() + atualizacao.getQuantidadeEntrada());
            return ResponseEntity.status(201).body("Medicamento atualizado com sucesso!");
        }
        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/medicamentos/{indice}")
    public ResponseEntity<String> excluirMedicamento(@PathVariable int indice) {
        if (indice >= 0 && indice < medicamentos.size()) {
            medicamentos.remove(indice);
            return ResponseEntity.noContent().build(); // 204 No Content
        }
        return ResponseEntity.status(404).build();
    }

    @GetMapping("/medicamentos/controlados")
            public ResponseEntity<List<Medicamentos>> pegarNomeMedicamentosControlados(){
        List<Medicamentos> medicamentoComReceita = medicamentos.stream()
                                                                .filter(medicamento -> medicamento.getPrecisaReceita()).toList();
            return ResponseEntity.status(200).body(medicamentoComReceita);
            }
}