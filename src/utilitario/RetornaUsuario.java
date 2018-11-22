package utilitario;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import banco.DAOGenerico;
import entidades.Usuario;

public class RetornaUsuario {
	
	public static Usuario get() {
		DAOGenerico<Usuario> dao = new DAOGenerico<>(Usuario.class);
		Usuario usuario = new Usuario();
		String nomeUsuario="";
		
		Authentication authentication = (Authentication) 
				SecurityContextHolder.getContext().getAuthentication(); 
		if(authentication != null){
			Object obj = authentication.getPrincipal();
			if (obj instanceof UserDetails) {
				nomeUsuario = ((UserDetails)obj).getUsername();
			} else {
				nomeUsuario = obj.toString();
			}		
		}
		
	List<Usuario> lf = dao.consultarCondicao("email='" + nomeUsuario + "'");
		if(lf.size()>0) {
			usuario = lf.get(0);
		}
		return usuario;
	}


}


