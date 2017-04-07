package org.foobarspam.regex;

public class Regex {

	private static String regexSubstractivos = "C[MD]|X[CL]|I[XV]";
	//private static String regexSumatorios = "\\bM{0,3}(?<!C)D?C{0,3}(?<!X)L?X{0,3}(?<!I)V?I{0,3}\\b";
	private static String regexSumatorios = "(?<!C)[DM]|(?<!X)[LC](?!D)|(?<!I)[VX](?![LC])|I(?![VX])";
	
	public static String getRegexSubstractivos() {
		return Regex.regexSubstractivos;
	}
	
	public static String getRegexSumatorios() {
		return Regex.regexSumatorios;
	}
	
	
}