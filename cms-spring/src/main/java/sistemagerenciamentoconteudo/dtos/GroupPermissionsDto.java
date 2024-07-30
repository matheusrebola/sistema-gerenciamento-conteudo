package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Groups;
import sistemagerenciamentoconteudo.entities.Permissions;

public record GroupPermissionsDto(
		Groups group,
		Permissions permission) {

}
