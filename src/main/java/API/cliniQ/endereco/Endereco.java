package API.cliniQ.endereco;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Embeddable
public class Endereco {
    private String logradouro;
    private String cep;
    private String bairro;
    private String complemento;
    private String numero;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.cep = endereco.cep();
        this.numero = endereco.numero();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
    }

    public void atualizarInformacoes(DadosEndereco endereco) {
        if (endereco.logradouro() != null){
            this.logradouro = endereco.logradouro();
        }
        if (endereco.bairro() != null){
            this.logradouro = endereco.logradouro();
        }
        if (endereco.cidade() != null){
            this.cidade = endereco.cidade();
        }
        if (endereco.cep() != null){
            this.cep = endereco.cep();
        }
        if (endereco.numero() != null){
            this.numero = endereco.numero();
        }
        if (endereco.uf() != null){
            this.uf = endereco.uf();
        }
        if (endereco.complemento() != null){
            this.complemento = endereco.complemento();
        }
    }

    public Endereco(){}
}
