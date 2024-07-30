package sistemagerenciamentoconteudo.dtos;

import sistemagerenciamentoconteudo.entities.Groups;
import sistemagerenciamentoconteudo.entities.Users;

public record UserGroupsDto(
		Groups group,
		Users user) {

}
