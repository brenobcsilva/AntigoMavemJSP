package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {

		testExcluir();
	}
	
	public static void testCadastrar() {
		Usuario usu = new Usuario();
		usu.setNome("Breno2");
		usu.setLogin("b2");
		usu.setSenha("bbbb");
		
		UsuarioDAO usudao = new UsuarioDAO();
		usudao.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testAlterar() {
		Usuario usu = new Usuario();
		usu.setId(15);
		usu.setNome("Breno3");
		usu.setLogin("b3");
		usu.setSenha("b3");
		
		UsuarioDAO usudao = new UsuarioDAO();
		usudao.alterar(usu);
		
		System.out.println("Alterado com sucesso!");
	}
	
	public static void testExcluir() {
		Usuario usu = new Usuario();
		usu.setId(15);
		
		UsuarioDAO usudao = new UsuarioDAO();
		usudao.excluir(usu);
		
		System.out.println("Excluido!");
	}

}
