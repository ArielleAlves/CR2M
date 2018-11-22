package entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RendaRaiz {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private double pesoSeco;
	private double pesoMolhado;
	private double rendaFinal;	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPesoSeco() {
		return pesoSeco;
	}
	public void setPesoSeco(double pesoSeco) {
		this.pesoSeco = pesoSeco;
	}
	public double getPesoMolhado() {
		return pesoMolhado;
	}
	public void setPesoMolhado(double pesoMolhado) {
		this.pesoMolhado = pesoMolhado;
	}
	public double getRendaFinal() {
		return rendaFinal;
	}
	public void setRendaFinal(double rendaFinal) {
		this.rendaFinal = rendaFinal;
	}
	
	
	
	
}
