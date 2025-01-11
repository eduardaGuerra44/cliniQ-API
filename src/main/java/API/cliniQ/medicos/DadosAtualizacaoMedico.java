package API.cliniQ.medicos;

import API.cliniQ.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,

        String telefone,
        DadosEndereco endereco) {

}
