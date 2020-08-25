package br.com.aleandro.pontointeligente.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class EmpresaDTO {
	
	private Long id;
	private String razaoSocial;
	private String cnpj;	
}