package aplicacion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ControllerLibro 
{
	static EntityManagerFactory entityManagerFactory;
	static EntityManager entityManager;
	
	public ControllerLibro() 
	{
		// TODO Auto-generated constructor stub
	}

	public static RepositoryLibro iniciarLibroRepo()
	{
		entityManagerFactory = Persistence.createEntityManagerFactory("formacion");
		entityManager = entityManagerFactory.createEntityManager();	
		
		RepositoryLibro repositoryLibro = new RepositoryLibro(entityManager);
		
		return repositoryLibro;
	}
	
	
	public static void close() 
	{
		entityManager.close();
		entityManagerFactory.close();
	}
	
	//public static void save(AuthorRepository authorRepository) {
	//public static void getAll(AuthorRepository authorRepository) {
	//public static void findBy(AuthorRepository authorRepository, BookRepository bookRepository) {
	//public static void deleteByName(AuthorRepository authorRepository) {
	//public static void addBookToAuthor(AuthorRepository authorRepository, BookRepository bookRepository) {
	
}
