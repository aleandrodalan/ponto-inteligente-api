package br.com.aleandro.pontointeligente.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CredenciaisDTO {

	private String login;
	private String senha;
}
