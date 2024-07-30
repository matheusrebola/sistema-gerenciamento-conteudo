package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.Plataform;

public record SocialMediaIntegrationCreateDto(
		Plataform plataform,
		String postId,
		LocalDateTime postedAt,
		Contents content) {

}
