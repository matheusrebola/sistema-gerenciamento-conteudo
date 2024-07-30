package sistemagerenciamentoconteudo.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import sistemagerenciamentoconteudo.entities.Roles;

public record UsersDto(
		@NotNull UUID id,
		String username,
		String password,
		String email,
		String fullName,
		Roles role) {

}
