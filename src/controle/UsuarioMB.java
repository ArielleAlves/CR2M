package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Produtores;
import entidades.Usuario;

@ManagedBean
@ViewScoped
public class UsuarioMB {
	private Produtores produtores;	
	private Usuario usuario;
	private DAOGenerico<Usuario> dao = new DAOGenerico<>(Usuario.class);
	private DAOGenerico<Produtores> daoProdutores = new DAOGenerico<>(Produtores.class);
	
	public UsuarioMB() {
		usuario = new Usuario();
	}
	
	//Retorna qual o tipo do usuário logado 
	public String getTipoUsuario() {
		if (usuario.getTipo().equals("Empresa")) {
			return "produtores.xhtml";
		} else if (usuario.getTipo().equals("Produtor")) {
			return "principalProdutor.xhtml";
		} else {
			return "";
		}
	}
	//Caso o usuario seja do tipo produtor, ao ser cadastrado um novo, 
	//será inserido um produtor para este usuário, 
	//pois o usuário do tipo produtor não pode cadastrar produtores para ele igual o as empresas
	public void inserirProdutor() {
	usuario.setTipo("Produtor");
		dao.salvar(usuario);
			produtores = new Produtores();			
			produtores.setNome(usuario.getUser());
			produtores.setUsuario(usuario);
			daoProdutores.salvar(produtores);
	}
	
	public void inserirEmpresa() {
		usuario.setTipo("Empresa");
		dao.salvar(usuario);
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
