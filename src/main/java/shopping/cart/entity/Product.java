package shopping.cart.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Pepsi;
    private String cheese;
    private String pen;
	public String getPepsi() {
		return Pepsi;
	}
	public  void setPepsi(String pepsi) {
		Pepsi = pepsi;
	}
	public String getCheese() {
		return cheese;
	}
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	public String getPen() {
		return pen;
	}
	public void setPen(String pen) {
		this.pen = pen;
	}
}