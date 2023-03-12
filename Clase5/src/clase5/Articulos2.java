package clase5;

public class Articulos2 {
public int codigo;
public String articulo;
public double precio;
public double descuento;
public double importe;

	public Articulos2(String articulo, int codigo, double precio, double descuento) {
		// TODO Auto-generated constructor stub
		this.codigo=codigo;
		this.articulo=articulo;
		this.precio=precio;
		this.descuento=descuento;
	}
	
	public Articulos2(String articulo, int codigo, double precio, double descuento, double importe) {
		// TODO Auto-generated constructor stub
		this.codigo=codigo;
		this.articulo=articulo;
		this.precio=precio;
		this.descuento=descuento;
		this.importe=importe;
	}
	
	
	public String cargaArt(String articulo, int codigo, double precio, double descuento) {
		String carga="Código: "+this.codigo+" Articulo: "+this.articulo+" Precio: "+this.precio+ " Descuento: "+this.descuento;
		return carga;
	}

	public String cargaVen(String articulo, int codigo, double precio, double descuento, double importe) {
		String carga2="Código: "+this.codigo+" Articulo: "+this.articulo+" Precio: "+this.precio+ " Descuento: "+this.descuento+" Importe a pagar: "+importe;
		return carga2;
	}
	

}
