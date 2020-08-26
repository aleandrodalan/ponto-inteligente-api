package br.com.aleandro.pontointeligente.api;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class TesteGerarSenhaCriptografada {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("teste123"));
	}
}