package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import it.development.jpa.beans.AnagraficaDaoRemote;
import it.development.jpa.entities.Anagrafica;

@WebService
public class WsImplementation {
	
	@EJB
    private AnagraficaDaoRemote testEjb;
	
	@WebMethod
	public String listaAnagrafica() throws NamingException {
		
//		ejb:WebServiceProjectEAR/jpaProject//AnagraficaDaon!it.development.jpa.beansAnagraficaDaoRemote
		
//		final String jndi = "ejb:jpaProject/AnagraficaDao!it.development.jpa.beans";
		final String jndi = "ejb:WebServiceProjectEAR/jpaProject//AnagraficaDao!it.development.jpa.beans.AnagraficaDaoRemote";
				testEjb = (AnagraficaDaoRemote) new InitialContext().lookup(jndi);
				List<Anagrafica> anagraficaList = testEjb.retrieveAllAnagrafica();
				
				String risposta = "";
				
				for (Anagrafica anagrafica : anagraficaList) {
					
					risposta = risposta.concat(anagrafica.getNome()).concat(" ");
				}
				
				return risposta;
	}
	
	@WebMethod
	public String diCiao() {
		
		System.out.println("Dico ciao a tutti");
		
		return "Ciao a tutti";
	}
	
	@WebMethod
	public String sayHello() {
		
		System.out.println("Hello");
		
		return "Ciao";
	}
	
	@WebMethod
	public String diQualcosa(String cosaDico) {
		
		System.out.println("Mi hanno fatto dire "+cosaDico);
		
		return cosaDico;
	}
}