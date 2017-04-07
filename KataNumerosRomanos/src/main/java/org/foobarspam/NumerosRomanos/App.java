package org.foobarspam.NumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.foobarspam.cifras.CifrasRomanas;
import org.foobarspam.regex.Regex;

public class App {
	
	public static void main(String[] args) {
	
	}
	
	public static int convert(String numeroRomano) {
		int sumaTotal = 0;
		
		//Con regex encontramos los grupos sumatorios
		Pattern pattern1 = Pattern.compile(Regex.getRegexSumatorios());

        Matcher matcher1 = pattern1.matcher(numeroRomano);
		
        while (matcher1.find()) {
        	sumaTotal+=convertSumatorios(matcher1.group());
        }
		
		
		//Con regex encontramos los grupos substractivos
		Pattern pattern2 = Pattern.compile(Regex.getRegexSubstractivos());

        Matcher matcher2 = pattern2.matcher(numeroRomano);
		
        while (matcher2.find()) {
        	sumaTotal+=convertSubstractivos(matcher2.group());
        }
		
		//devolvemos el resultado
		return sumaTotal;
	}
	
	public static int convertSumatorios(String numeroRomano) {
		int valor = 0;
		
		//Convertimos numeroRomano a array de char.
		char[] arrayNumeroRomano = numeroRomano.toCharArray();
		
		//Hacemos un for en el array 
		for(char letra : arrayNumeroRomano) {
			//por cada letra convertimos la letra a enum type y encontramos el valor de la letra
			String letraMod = ""+letra;
			CifrasRomanas cifraRomana = CifrasRomanas.valueOf(letraMod);
					
			//sumamos el valor de la letra a 'valor'
			valor+=cifraRomana.getValor();//matcher.group
		}
		return valor;
	}
	
	
	public static int convertSubstractivos(String grupoSubstractivo) {
		int valor = 0;

		char[] arrayNumeroRomano = grupoSubstractivo.toCharArray();
		
		String letraMod1 = ""+arrayNumeroRomano[0];
		String letraMod2 =""+arrayNumeroRomano[1];
		
		CifrasRomanas cifraRomana1 = CifrasRomanas.valueOf(letraMod1);
		CifrasRomanas cifraRomana2 = CifrasRomanas.valueOf(letraMod2);
		
		valor=cifraRomana2.getValor()-cifraRomana1.getValor();//matcher.group
		
		return valor;
	}
	
}

