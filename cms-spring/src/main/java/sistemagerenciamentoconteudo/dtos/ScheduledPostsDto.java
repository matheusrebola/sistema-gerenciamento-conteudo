package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.StatusPost;

public record ScheduledPostsDto(
		@NotNull UUID id,
		LocalDateTime scheduledFor,
		StatusPost statusPost,
		Contents content) {

}
