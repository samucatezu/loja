package gft.loja.dto.filial;

import gft.loja.dto.endereco.EnderecoMapper;
import gft.loja.entitites.Filial;

public class FilialMapper {

    public static Filial fromDTO(RegistroFilialDTO dto) {
        return new Filial(null, dto.getName(), EnderecoMapper.fromDTO(dto.getEndereco()));
    }

    public static ConsultaFIlialDTO fromEntity(Filial filial) {
        return new ConsultaFIlialDTO(filial.getId(), filial.getName(), EnderecoMapper.fromEntity(filial.getEndereco()));
    }

}
