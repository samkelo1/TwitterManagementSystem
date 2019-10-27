package controller;

import java.io.IOException;

import javax.servlet.ServletException;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class TwitterDriver {
	
	private Twitter twitter;
	private Status status;
	
	public void tweetOut(String message) throws ServletException, TwitterException {
		twitter = TwitterFactory.getSingleton();
		
	
		
		status = twitter.updateStatus(message);
	}

	public Long getTweetID() {
		return status.getId();
	}
}