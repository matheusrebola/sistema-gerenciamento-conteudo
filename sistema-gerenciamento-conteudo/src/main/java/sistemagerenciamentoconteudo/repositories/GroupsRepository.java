package sistemagerenciamentoconteudo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.Groups;

@Repository
public interface GroupsRepository extends JpaRepository<Groups, UUID> {

}
