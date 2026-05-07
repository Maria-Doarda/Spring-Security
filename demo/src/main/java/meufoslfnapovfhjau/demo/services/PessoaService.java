package meufoslfnapovfhjau.demo.services;

import jakarta.persistence.Table;
import meufoslfnapovfhjau.demo.models.PessoaModel;
import meufoslfnapovfhjau.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;


    public PessoaModel criarPessoa(PessoaModel pessoaModel){
        return pessoaRepository.save(pessoaModel);
    }

    public List<PessoaModel> findAll(){
        return pessoaRepository.findAll();
    }

    public Optional<PessoaModel> buscarId(Long id){
        return pessoaRepository.findById(id);
    }

    public void deletar(Long id){
        pessoaRepository.deleteById(id);
    }

}
