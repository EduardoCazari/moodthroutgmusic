package moodthroutgmusic;

public class Roots extends Album {

    private String title3;
    private String matchingItem3;
  
    public Roots(String artist, String title3) {
      super(artist);
      this.title3 = title3;
    }
  
    public void setMatchingItem3(String matchingItem3) {
      this.matchingItem3 = matchingItem3;
    }
  
    @Override
    public void sugestion() {
      System.out.println("This " + this.artist + " album named " + this.title3 + " is perfect for the mood you want to get into. It also goes well with " + matchingItem3);
    }
  
    @Override
    public void finalMessage() {
      System.out.println("See you soon!");
    } 
    
  }
