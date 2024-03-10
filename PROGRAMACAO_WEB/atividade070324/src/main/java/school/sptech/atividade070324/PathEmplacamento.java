package school.sptech.atividade070324;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PathEmplacamento {

    @NotBlank
    @Size(min = 7, max = 8)
    private String novaPlaca;

    private String motivo;

    public String getNovaPlaca() {
        return novaPlaca;
    }

    public String getMotivo() {
        return motivo;
    }
}
