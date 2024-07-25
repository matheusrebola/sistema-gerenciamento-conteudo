package sistemagerenciamentoconteudo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.Permissions;

@Repository
public interface PermissionsRepository extends JpaRepository<Permissions, UUID> {

}
