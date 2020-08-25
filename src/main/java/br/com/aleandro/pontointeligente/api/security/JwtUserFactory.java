package br.com.aleandro.pontointeligente.api.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import br.com.aleandro.pontointeligente.api.entities.Funcionario;
import br.com.aleandro.pontointeligente.api.enums.PerfilEnum;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JwtUserFactory {

	public static JwtUser create(Funcionario funcionario) {
		return new JwtUser(funcionario.getId(), 
						   funcionario.getEmail(), 
						   funcionario.getSenha(), 
						   mapToGrantedAuthorities(funcionario.getPerfil()));
	}

	private static List<? extends GrantedAuthority> mapToGrantedAuthorities(PerfilEnum perfil) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(perfil.toString()));
		
		return authorities;
	}
}
