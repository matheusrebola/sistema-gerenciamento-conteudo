package sistemagerenciamentoconteudo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.SocialMediaIntegration;

@Repository
public interface SocialMediaIntegrationRepository extends JpaRepository<SocialMediaIntegration, UUID> {

}
