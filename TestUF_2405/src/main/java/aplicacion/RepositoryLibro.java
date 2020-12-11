package aplicacion;

import java.util.List;

import javax.persistence.EntityManager;

public class RepositoryLibro {
	
	private EntityManager entityManager;

	public RepositoryLibro(EntityManager entityManager) 
	{
		
		this.entityManager = entityManager;
	}
	
	
	public List<Libro> buscarTodosLosLibros() 
	{
		List listaLibros = entityManager.createNamedQuery("Libros.BuscarTodosLosLibros", Libro.class)
				.getResultList();
		if (listaLibros != null)
			return listaLibros;
		else
			return null;
	}
	
	
}
