package meufoslfnapovfhjau.demo.services;

import meufoslfnapovfhjau.demo.models.PessoaModel;
import meufoslfnapovfhjau.demo.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;


}
