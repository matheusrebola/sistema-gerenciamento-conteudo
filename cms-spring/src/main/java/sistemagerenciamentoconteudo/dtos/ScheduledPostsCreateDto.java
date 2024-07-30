package sistemagerenciamentoconteudo.dtos;

import java.time.LocalDateTime;

import sistemagerenciamentoconteudo.entities.Contents;
import sistemagerenciamentoconteudo.entities.StatusPost;

public record ScheduledPostsCreateDto(
		LocalDateTime scheduledFor,
		StatusPost statusPost,
		Contents content) {

}
