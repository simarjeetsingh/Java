package org.foobarspam.expresionesRegulares;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dni extends tarjetaId {
	//PROPIEDADES
		private String expReg = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
		private byte idLongitud = 0;
		
		//CONSTRUCTOR
		public Dni() {
		}
		
		public Dni(String numeroId){
			super(numeroId);
		}
		
		//SETTER Y GETTER
		public String getExpReg() {
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
