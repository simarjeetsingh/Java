package org.foobarspam.expresionesRegulares;

public abstract class tarjetaId {
		//PROPIEDADES
		String numeroId = null;
		char[] tablaAsignacion = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
		byte idLongitud = 0;
		//CONSTRUCTOR
		public tarjetaId() {
		}
		
		public tarjetaId(String numeroId){
			this.numeroId = numeroId;
		}
		
		//GETTERS y SETTERS
		public String getNumeroId(){
			return this.numeroId;
		}
		
		public char[] getTablaAsignacion(){
			return this.tablaAsignacion;
		}
		
		
		//METODOS
		public abstract boolean formatoValido();
				
	}


