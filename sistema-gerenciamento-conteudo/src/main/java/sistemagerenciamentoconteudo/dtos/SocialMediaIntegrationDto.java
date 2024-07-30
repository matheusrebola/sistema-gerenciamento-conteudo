package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.Plataform;

public record SocialMediaIntegrationDto(
		@NotNull UUID id,
		Plataform plataform,
		String postId,
		LocalDateTime postedAt,
		Contents content) {

}
