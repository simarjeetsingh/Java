package Bisiesto;


public class AnyoBisiesto {
	
	private int year = 0;
	
	public AnyoBisiesto(int year){
		this.year = year;		
	}
	
	public int getYear(){
		return this.year;
	}
	public void setYear(int year){
		this.year = year;
	}
	
	public Boolean esBisiesto(){
		return (getYear() % 4 == 0 && (getYear() % 100 != 0 || getYear() % 400 == 0));
	}
}