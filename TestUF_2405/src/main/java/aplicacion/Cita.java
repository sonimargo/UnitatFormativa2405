package aplicacion;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CITA")
@NamedQueries
	({ 
		//@NamedQuery(name = "Quotes.findByAutor", query = "SELECT b FROM Quotes b WHERE b.libro_id = :book.book_id"),
		@NamedQuery(name = "Cita.BuscarTodasLasCitas", query = "SELECT c FROM Cita c") 
	})

public class Cita 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_Cita;
	
	private String cita;
	private int numeroPalabra;
	
//	@ManyToOne
//	@JoinColumn (name = "BOOK_ID")
//	private Book book;
			
	public Cita() 
	{
		super();
	}
	
	public Cita(int id, String cita, int numeroPalabra, Libro libro) 
	{
			super();
			this.id_Cita = id;
			this.cita = cita;
			this.numeroPalabra = numeroPalabra;
	//		this.book = book;
	}
	
	public Cita(String cita, int numeroPalabra) 
	{
			super();
			this.cita = cita;
			this.numeroPalabra = numeroPalabra;
	}

	public int getIdCita() 
	{
		return id_Cita;
	}
	
	public void setIdCita(int id) 
	{
		this.id_Cita = id;
	}
	
	public String getCita() 
	{
		return cita;
	}
	
	public void setCita(String cita) 
	{
		this.cita = cita;
	}
	
	
	
	public int getNumeroPalabra() 
	{
		return numeroPalabra;
	}
	
	public void setNumeroPalabra(int numeroPalabra) 
	{
		this.numeroPalabra = numeroPalabra;
	}
	
	/*
	 * public Book getBook() { return book; }
	 * 
	 * public void setBook(Book book) { this.book = book; }
	 */
	
	@Override
	public String toString() 
	{
		return "\n    Citas: id=" + id_Cita + ", cita:" + cita + ", numero palabras:" + numeroPalabra  
				//"+ , book=" + book + 
				;
	}
}