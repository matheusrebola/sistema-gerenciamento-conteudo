package sistemagerenciamentoconteudo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.UserGroups;

@Repository
public interface UserGroupsRepository extends JpaRepository<UserGroups, UUID> {

}
