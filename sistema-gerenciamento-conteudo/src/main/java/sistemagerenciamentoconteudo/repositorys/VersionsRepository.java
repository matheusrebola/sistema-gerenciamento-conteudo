package sistemagerenciamentoconteudo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.Versions;

@Repository
public interface VersionsRepository extends JpaRepository<Versions, UUID> {

}
