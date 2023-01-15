package moodthroutgmusic;

abstract class Album {

    String artist;
  
    public Album(String artist){
      this.artist = artist;
    }
  
    abstract void sugestion(); 
  
    public void finalMessage() {
      System.out.println();
    } 
    
  }
