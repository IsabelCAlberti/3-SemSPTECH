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
}