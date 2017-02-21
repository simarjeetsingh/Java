package org.foobarspam.Bowling;

public class ScoreCard {
	private int totalScore = 0;
	private String scoreCard;
	public int pruebas=0;
	
	public ScoreCard(String pins) {
		this.scoreCard = pins;
	}

	public String getScoreCard(){
		return this.scoreCard;
	}
		
	public int getTotalScore(){
		calculateScore(this.scoreCard);
		return this.totalScore;
	}
		
	public static int getSimbolValue(char symbol){
		if (symbol == '-'){
			return 0;
		}
		else if(symbol == 'X'){
			return 10;
		}
		else if(symbol == '/'){
			return 11;
		}
		
		return Character.getNumericValue(symbol);
	}
		
	private void calculateScore(String scoreCard){
		int total = 0;
	
		for(int i=0; i < scoreCard.length(); i++){
			if((getSimbolValue(scoreCard.charAt(i)) == 11)&&(i == 19)){
				total = calculaSpare(scoreCard, i, total);
				i++;
			}
			else if((getSimbolValue(scoreCard.charAt(i)) == 11)){
				total = calculaSpare(scoreCard, i, total);
			}
			else{
			total +=  getSimbolValue(scoreCard.charAt(i));
			}
		}
		this.totalScore = total ;
	}
		
	private int calculaSpare(String scoreCard, int position, int total){
		int resultado = total; 
		resultado -= getSimbolValue(scoreCard.charAt(position-1));
		resultado += getSimbolValue(scoreCard.charAt(position))-1;
		resultado += getSimbolValue(scoreCard.charAt(position+1));
		return resultado;
	}
}
