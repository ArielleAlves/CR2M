package controle;

import entidades.Usuario;

public class UsuarioMB {
	private Usuario usuario;
	
	public void getTipoUsuario() {
		if (usuario.getTipo().equals("Empresa")) {
			//chamaTela de produtores
		} else if (usuario.getTipo().equals("Produtor")) {
			//Pega produtor do usuario
			//chamaTela principal com produtor selecionado
		}
	}
	
	public void inserir() {
		//salvar
		if (usuario.getTipo().equals("Produtor")) {
			//inserir produtor unico para o usuario
		}
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
