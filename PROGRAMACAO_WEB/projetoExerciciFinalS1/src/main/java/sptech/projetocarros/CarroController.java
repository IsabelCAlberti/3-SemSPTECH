package sptech.projetocarros;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/carros")
public class CarroController {

    private List<Carro> carros = new ArrayList<>();

    void validarPlaca(String placa) {
        // mesmo que: carros.stream().filter(carro -> carro.getPlaca().equals(placa)).count() > 0-
        if (carros.stream().anyMatch(carro -> carro.getPlaca().equals(placa))) {
            throw new ResponseStatusException(HttpStatusCode.valueOf(409), "Placa já cadastrada");
        }
    }

    @PostMapping
    public ResponseEntity<Carro> post(@RequestBody @Valid Carro novoCarro) {
        validarPlaca(novoCarro.getPlaca());

        novoCarro.setMotivoMudancaPlaca(null);
        carros.add(novoCarro);
        return ResponseEntity.status(201).body(novoCarro);
    }

    @GetMapping
    public ResponseEntity<List<Carro>> get(UUID id) {
        if (carros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(carros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getUm(@PathVariable UUID id) {
        List<Carro> encontrados = carros.stream().filter(carro -> carro.getId().equals(id)).toList();

        if (encontrados.isEmpty()) {
            return ResponseEntity.status(404).build();
        }

        return ResponseEntity.status(200).body(encontrados.get(0));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> put(@PathVariable UUID id,
                                     @RequestBody @Valid Carro carroAtualizado) {

        validarPlaca(carroAtualizado.getPlaca());

        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId().equals(id)) {
                carros.set(i, carroAtualizado);
                return ResponseEntity.status(200).body(carros.get(i));
            }
        }

        return ResponseEntity.status(404).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {

        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId().equals(id)) {
                carros.remove(i);
                return ResponseEntity.status(204).build();
            }
        }

        return ResponseEntity.status(404).build();
    }

    @PatchMapping("/{id}/emplacamento")
    public ResponseEntity<Carro>
            emplacar(@PathVariable UUID id, @RequestBody @Valid PatchEmplacamento emplacamento) {

        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            if (carro.getId().equals(id)) {
                carro.setPlaca(emplacamento.getNovaPlaca());
                carro.setMotivoMudancaPlaca(emplacamento.getMotivo());
                return ResponseEntity.status(200).body(carro);
            }
        }

        return ResponseEntity.status(404).build();
    }

    @GetMapping("/simples-ipva")
    public ResponseEntity<List<CarroSimples>> getSimples() {
        if (carros.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(CarroSimples.deLista(carros));
    }
}



