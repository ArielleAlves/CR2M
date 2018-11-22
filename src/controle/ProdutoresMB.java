package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
import entidades.Produtores;
import entidades.Usuario;

@ManagedBean
@ViewScoped
public class ProdutoresMB {
	private Produtores produtores;
	private Usuario usuario;
	private DAOGenerico<Produtores> dao = new DAOGenerico<>(Produtores.class);
	
	public void inserir() {
		dao.salvar(produtores);
	}
	
	public void remover() {
		dao.excluir(produtores.getId());
	}
	
	public Produtores getProdutores() {
		return produtores;
	}
	public void setProdutores(Produtores produtores) {
		this.produtores = produtores;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
