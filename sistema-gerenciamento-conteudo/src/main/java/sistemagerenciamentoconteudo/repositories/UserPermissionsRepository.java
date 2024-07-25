package sistemagerenciamentoconteudo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.UserPermissions;

@Repository
public interface UserPermissionsRepository extends JpaRepository<UserPermissions, UUID> {

}
