package sistemagerenciamentoconteudo.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.GroupPermissions;

@Repository
public interface GroupPermissionsRepository extends JpaRepository<GroupPermissions, UUID> {

}
