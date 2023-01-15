package moodthroutgmusic;

public class Passages extends Album {

    private String title2;
    private String matchingItem2;
  
    public Passages(String artist, String title2) {
      super(artist);
      this.title2 = title2;
    }
  
    public void setMatchingItem2(String matchingItem2) {
      this.matchingItem2 = matchingItem2;
    }
  
    @Override
    public void sugestion() {
      System.out.println("This " + this.artist + " album named " + this.title2 + " is perfect for the mood you want to get into. It also goes well with " + matchingItem2);
    }
  
    @Override
    public void finalMessage() {
      System.out.println("And remember, there are more options for a next time.");
    } 
    
  }
