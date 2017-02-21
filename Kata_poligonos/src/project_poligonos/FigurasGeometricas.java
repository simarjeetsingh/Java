package project_poligonos;

public abstract class FigurasGeometricas {
	private String nombre;
	public FigurasGeometricas(){
		this.nombre = "Unknown";
	}
	public FigurasGeometricas(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	// OCP(open closed)
	public abstract double area();
}
