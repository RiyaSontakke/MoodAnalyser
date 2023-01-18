package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	String message;
	public MoodAnalyser() {
		
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}

	public String analyseMood(String message) {
		try {
		    if (this.message.contains("SAD")) {
		      return "SAD" ;
		    }
		}catch(NullPointerException ex) {
			return "HAPPY";
		}
			return "HAPPY" ;
		
	}	
}	
	
	

