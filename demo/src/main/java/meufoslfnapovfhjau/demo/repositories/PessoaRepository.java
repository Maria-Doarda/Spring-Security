package meufoslfnapovfhjau.demo.repositories;

import meufoslfnapovfhjau.demo.models.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Long, PessoaModel> {
}
