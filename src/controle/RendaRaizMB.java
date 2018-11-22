package controle;

import entidades.Produtores;
import entidades.RendaRaiz;

public class RendaRaizMB {
	public RendaRaiz rendaRaiz;
	public Produtores produtores;
	
	public void calcularRenda() {
		rendaRaiz.setRendaFinal(
				rendaRaiz.getPesoSeco()/(rendaRaiz.getPesoSeco() - rendaRaiz.getPesoMolhado()));
	}
	public void salvar() {
		if (rendaRaiz.getRendaFinal() != 0) {
			//salvar
		} else {
			//retornar mensagem
		}
	}
	public void remover() {
		//excluir
	}
}
