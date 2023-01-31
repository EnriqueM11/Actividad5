public class Circulo {
	public float id;
	public float circunferencia;
	public float area;
	
	public Circulo() {
		this(174798);}
	
	public Circulo(float id) {
	this.id=id;}
	
	public float circunferencia () {
	return circunferencia=(float)(2*3.1416*id);
	}	
	
	public float area() {
		return area=(float) (3.1416*(Math.pow(id, 2)));
		
	}

}