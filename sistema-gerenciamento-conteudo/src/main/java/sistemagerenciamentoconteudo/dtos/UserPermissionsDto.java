package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Permissions;
import sistemagerenciamentoconteudo.entities.Users;

public record UserPermissionsDto(
		Users user,
		Permissions permission) {

}
