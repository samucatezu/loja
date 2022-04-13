package gft.loja.dto.filial;

import gft.loja.dto.endereco.EnderecoDTO;

public class ConsultaFIlialDTO {

    private Long Id;
    private String name;
    private EnderecoDTO endereco;

    public ConsultaFIlialDTO() {
    }

    public ConsultaFIlialDTO(Long id, String name, EnderecoDTO endereco) {
        Id = id;
        this.name = name;
        this.endereco = endereco;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnderecoDTO getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDTO endereco) {
        this.endereco = endereco;
    }
}
