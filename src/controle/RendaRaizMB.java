package controle;

import entidades.Produtores;
import entidades.RendaRaiz;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import banco.DAOGenerico;
//Controle com as funçoes envolvendo a renda da raiz de mandioca
@ManagedBean
@ViewScoped
public class RendaRaizMB {
	// declarações
	private RendaRaiz rendaRaiz;
	private Produtores produtores;
	private DAOGenerico<RendaRaiz> dao = new DAOGenerico<>(RendaRaiz.class);
	
	public RendaRaiz getRendaRaiz() {
		return rendaRaiz;
	}
	public void setRendaRaiz(RendaRaiz rendaRaiz) {
		this.rendaRaiz = rendaRaiz;
	}
	public Produtores getProdutores() {
		return produtores;
	}
	public void setProdutores(Produtores produtores) {
		this.produtores = produtores;
	}
	public void calcularRenda() {
		rendaRaiz.setRendaFinal(
				rendaRaiz.getPesoSeco()/(rendaRaiz.getPesoSeco() - rendaRaiz.getPesoMolhado()));
	}
	public void salvar() {
		if (rendaRaiz.getRendaFinal() != 0) {
			dao.salvar(rendaRaiz);
		} else {
			//retornar mensagem
		}
	}
	public void remover() {
		dao.excluir(rendaRaiz.getId());
	}
}
