public class cuadrado {
	public int numero;
	public int perimetro;
	public int area;
	public int diagonal;
	
	public cuadrado() {
		this(174798);}
	
	public cuadrado(int numero) { 	
		this.numero=numero;}
	
	public int perimetro() {
		return perimetro=numero*4;
	}
	
	public int area() {
		return area=numero*2;
	}
	public int diagonal() {
		return diagonal=(int)Math.sqrt(Math.pow(numero, 2)+Math.pow(numero, 2));
	}
	
}
	