package school.sptech.atividade070324;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carros")
public class CarrosController {
    private List<Carro> carros = new ArrayList<>();


    @GetMapping()
    public ResponseEntity<List<Carro>> buscarCarros() {
        if (carros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> buscarCarroPorId(@PathVariable UUID id) {
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getId().equals(id)) {
                return ResponseEntity.status(200).body(carro);
            }
        }
        return ResponseEntity.status(404).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> atualizarCarro(@RequestBody @Valid Carro carroAtualizado) {
        for (Carro carro : carros) {
            if (carro.getId().equals(carroAtualizado.getId())) {
                carro.setMarca(carroAtualizado.getMarca());
                carro.setModelo(carroAtualizado.getModelo());
                carro.setCor(carroAtualizado.getCor());
                carro.setPlaca(carroAtualizado.getPlaca());
                carro.setAno(carroAtualizado.getAno());
                carro.setPreco(carroAtualizado.getPreco());
                return ResponseEntity.status(200).body(carro);
            }
        }
    return ResponseEntity.status(404).build();
    }

    @PostMapping()
    public ResponseEntity<Carro> criarCarro(@RequestBody @Valid Carro novoCarro) {
        novoCarro.setMotivoMudancaPlaca(null);
        carros.add(novoCarro);
        return ResponseEntity.status(201).body(novoCarro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Carro> deletarCarro(@PathVariable UUID id) {
        for(Carro carro : carros) {
            if (carro.getId().equals(id)) {
                carros.remove(carro);
                return ResponseEntity.status(200).build();
            }
        }
        return ResponseEntity.status(404).build();
    }

    /*@PatchMapping("/{id}/placa)
    public ResponseEntity<Carro> emplacarCarro(@PathVariable UUID id, @RequestBody String novoMotivoMudancaPlaca) {


}*/
}

