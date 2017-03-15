package org.foobarspam.expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Nie extends tarjetaId{
	//PROPIEDADES
	private byte idLongitud = 0;	
	private String expReg = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
	
		
	//CONSTRUCTOR
	public Nie() {
	}
		
	public Nie(String numeroId){
		super(numeroId);
	}
			
	//SETTER Y GETTER
	public String getExpReg(){
		return this.expReg;
	}
	public void setNumeroId(String numeroId){
			this.numeroId = numeroId;
	}
	//METODOS
	public boolean formatoValido() {
		Pattern pattern = Pattern.compile(getExpReg());
				
		Matcher matcher = pattern.matcher(getNumeroId());

		if (matcher.find() && getNumeroId().length() == this.idLongitud) {
			return true;
		}
		else {
			return false;
		}
}

}
