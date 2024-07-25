package sistemagerenciamentoconteudo.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sistemagerenciamentoconteudo.entities.ScheduledPosts;

@Repository
public interface ScheduledPostsRepository extends JpaRepository<ScheduledPosts, UUID> {

}
