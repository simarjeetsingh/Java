package org.foobarspam.Bowling;

import static org.junit.Assert.*;

import org.junit.Test;
import org.foobarspam.Bowling.ScoreCard;
public class BowlingTest {

	@Test
	public void getSimbolValueTest() {

		String symbols = "-123456789X/";

		for (int index = 0; index < symbols.length(); index++) {
			assertEquals(index, ScoreCard.getSimbolValue(symbols.charAt(index)));
		}
	}

	@Test
	public void TotalScoreHittingPins() {

		// Hitting pins total = 60
		String pins = "12345123451234512345";
		int total = 60;

		ScoreCard scoreCard = new ScoreCard(pins);

		// calculateScore(scoreCard);

		assertEquals(total, scoreCard.getTotalScore());
	}

	@Test
	public void TotalScoreHittingPinsFail() {

		// test symbol -

		String pins = "9-9-9-9-9-9-9-9-9-9-";
		int total = 90;
		ScoreCard scoreCard = new ScoreCard(pins);
		// calculateScore(scoreCard);
		assertEquals(total, scoreCard.getTotalScore());

		pins = "9-3561368153258-7181";
		total = 82;
		scoreCard = new ScoreCard(pins);
		// calculateScore(scoreCard);
		assertEquals(total, scoreCard.getTotalScore());
	}

	@Test
	public void TotalScoreSpare() {
		/*
		 * If in two tries he knocks them all down, this is called a gspareh
		 * and his score for the frame is ten plus the number of pins knocked
		 * down on his next throw (in his next turn). If he gets a spare or
		 * strike in the last (tenth) frame, the bowler gets to throw one or two
		 * more bonus balls, respectively. - These bonus throws are taken as
		 * part of the same turn. If the bonus throws knock down all the pins,
		 * the process does not repeat: the bonus throws are only used to
		 * calculate the score of the final frame.
		 */

		String pins = "5/5/5/5/5/5/5/5/5/5/5";
		int total = 150;
		ScoreCard scoreCard = new ScoreCard(pins);
		// calculateScore(scoreCard);
		assertEquals(total, scoreCard.getTotalScore());

		pins = "9-3/613/815/-/8-7/8/8";
		total = 131;
		scoreCard = new ScoreCard(pins);
		// calculateScore(scoreCard);
		assertEquals(total, scoreCard.getTotalScore());

	}

}
