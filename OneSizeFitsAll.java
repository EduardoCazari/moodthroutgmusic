package moodthroutgmusic;

public class OneSizeFitsAll extends Album {

    private String title1;
    private String matchingItem1;
  
    public OneSizeFitsAll(String artist, String title1) {
      super(artist);
      this.title1 = title1;
    }
  
    public void setMatchingItem1(String matchingItem1) {
      this.matchingItem1 = matchingItem1;
    }
    
    @Override
    public void sugestion() {
      System.out.println("This " + this.artist + " album named " + this.title1 + " is perfect for the mood you want to get into. It also goes well with " + matchingItem1);
    }
  
    @Override
    public void finalMessage() {
      System.out.println("I hope you enjoy your mood!");
    } 
    
  }
