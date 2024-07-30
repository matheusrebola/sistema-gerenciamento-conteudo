package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Roles;

public record UsersCreateDto(
		String username,
		String password,
		String email,
		String fullName,
		Roles role) {

}
