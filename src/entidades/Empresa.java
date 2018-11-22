package entidades;

import javax.persistence.Entity;

@Entity
public class Empresa extends Usuario {
	
	private String razao;
	private String cnpj;
	
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
