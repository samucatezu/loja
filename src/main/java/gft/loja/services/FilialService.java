package gft.loja.services;

import gft.loja.entitites.Filial;
import gft.loja.repositories.FilialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilialService {

    private final FilialRepository filialRepository;

    public FilialService(FilialRepository filialRepository){
        this.filialRepository = filialRepository;
    }

    public Filial salvarFilial(Filial filial) {

        return this.filialRepository.save(filial);

    }

    public List<Filial> listarTodasAsFiliais(){

        return filialRepository.findAll();

    }

}
