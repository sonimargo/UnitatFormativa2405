package aplicacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LIBRO")
@NamedQueries
	({ 
	//	@NamedQuery(name = "Libros.buscarPorTitulo", query = "SELECT b FROM Libros b WHERE b.titulo = :titulo"),
		@NamedQuery(name = "Libro.BuscarTodosLosLibros", query = "SELECT l FROM Libro l") 
	})

public class Libro 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id_Libro;
	
	@Column(name = "TITULO")
	private String titulo;
	
//	@OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
//	private List<Quotes> listaQuotes = new ArrayList<>();

	Libro() 
	{}

	public Libro(Integer id, String titol) 
	{
		this.id_Libro = id;
		this.titulo = titol;
	}

	public Libro(String titol) 
	{
		this.titulo = titol;
	}

	

	
	public Integer getId() 
	{
		return id_Libro;
	}

	public void setId(Integer id) 
	{
		this.id_Libro = id;
	}

	public String getTitulo() 
	{
		return titulo;
	}

	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}
		
	/*
	 * public List<Quotes> getQuotes() { return listaQuotes; }
	 * 
	 * public void setQuote (List<Quotes> quotes) { this.listaQuotes = quotes; }
	 */

	@Override
	public String toString() 
	{
		return "\nLibro: " + id_Libro + ", titulo:" + titulo 
				//+ ", listaQuotes=" + listaQuotes 
				;
	}
}
