package banco;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fabrica {
private static EntityManagerFactory fab;
	
	
	public  static EntityManagerFactory get(){
		if (fab == null) {
			fab = Persistence.createEntityManagerFactory("cr2m_hackthon");
		}
		return fab;
	}
	
	
	

}
