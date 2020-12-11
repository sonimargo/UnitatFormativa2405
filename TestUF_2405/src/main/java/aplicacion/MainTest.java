package aplicacion;

import java.util.List;

public class MainTest {

	public static void main(String[] args) 
	{
		System.out.println("Inicio ....");
		
		RepositoryLibro repositoryLibro = ControllerLibro.iniciarLibroRepo();

		List<Libro> lista = repositoryLibro.buscarTodosLosLibros();
		
		System.out.println("**********************************");
		System.out.println("**********************************");
		System.out.println("*** Ini Impresion lista libros ***");
		System.out.println();
		System.out.println();
		System.out.println(lista);
		System.out.println();
		System.out.println();
		System.out.println("*** Fin Impresion lista libros ***");
		System.out.println("**********************************");
		System.out.println("**********************************");
		
		ControllerLibro.close();
		
		System.out.println("Final ....");
		
	}
}
