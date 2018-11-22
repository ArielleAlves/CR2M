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
	
	public String getTipoUsuario() {
		if (usuario.getTipo().equals("Empresa")) {
			return "produtores.xhtml";
		} else if (usuario.getTipo().equals("Produtor")) {
			return "principalProdutor.xhtml";
		} else {
			return "";
		}
	}
	
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
