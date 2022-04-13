package gft.loja.controllers;

import gft.loja.dto.filial.ConsultaFIlialDTO;
import gft.loja.dto.endereco.EnderecoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/filiais")
public class FilialController {

    @GetMapping
    public ResponseEntity<List<ConsultaFIlialDTO>> buscarTodasAsFiliais(){

        EnderecoDTO endereco1 = new EnderecoDTO();
        endereco1.setLogradouro("Rua B");

        EnderecoDTO endereco2 = new EnderecoDTO();
        endereco2.setLogradouro("Rua A");

        ConsultaFIlialDTO filial1 = new ConsultaFIlialDTO();
        filial1.setName("Filial A");
        filial1.setEndereco(endereco1);

        ConsultaFIlialDTO filial2 = new ConsultaFIlialDTO();
        filial2.setName("Filial B");
        filial2.setEndereco(endereco2);

        List<ConsultaFIlialDTO> lista = List.of(filial1, filial2);

        return ResponseEntity.ok(lista);
    }
}
