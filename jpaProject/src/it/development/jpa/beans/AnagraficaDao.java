package it.development.jpa.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import it.development.jpa.entities.Anagrafica;

/**
 * Session Bean implementation class AnagraficaDao
 */
@Stateless
@LocalBean
public class AnagraficaDao implements AnagraficaDaoRemote {

	@PersistenceContext(name="anagrafica")
	private EntityManager em;
	
    public AnagraficaDao() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addAnagrafica(Anagrafica anagrafica) {
		em.persist(anagrafica);
		
	}

	@Override
	public void removeAnagrafica(Anagrafica anagrafica) {
		em.remove(anagrafica);
		
	}

	@Override
	public void updateAnagrateafica(Anagrafica anagrafica) {
		em.merge(anagrafica);
		
	}


	@Override
	public Anagrafica findAnagrafica(Anagrafica anagrafica) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Anagrafica> retrieveAnagraficaByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Anagrafica> retrieveAllAnagrafica() {
		@SuppressWarnings("unchecked")
		List<Anagrafica> anagraficaList = em.createQuery("SELECT a FROM anagrafica a").getResultList();
		return anagraficaList;
	}

	@Override
	public String findGiorgia() {
		
		return "Giorgia";
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	} 
	
	

}
