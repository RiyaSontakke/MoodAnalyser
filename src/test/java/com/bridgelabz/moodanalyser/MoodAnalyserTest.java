package com.bridgelabz.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void givenMessage_whenSad_shouldReturnSadMood() {
	   MoodAnalyser moodAnalyser = new MoodAnalyser();
	   String mood = moodAnalyser.analyseMood("I am in SAD Mood");
	   Assert.assertEquals( "SAD", mood);
	}
	@Test
	public void givenMessage_whenanymood_shouldReturnHappyMood() {
	   MoodAnalyser moodAnalyser = new MoodAnalyser();
	   String mood = moodAnalyser.analyseMood("I am in HAPPY Mood");
	   Assert.assertEquals( "HAPPY", mood);
	
	}

}
