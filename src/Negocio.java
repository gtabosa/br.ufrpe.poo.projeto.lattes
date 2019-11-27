import java.util.Calendar;


public class Negocio {

	double preco;
	double quantidade;
	Calendar date;
	
	public double getPreco() {
		return preco;
	}
	public Negocio(double preco, double quantidade, Calendar calendar) {
		super();
		this.preco = preco;
		this.quantidade = quantidade;
		this.date = calendar;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	
}
