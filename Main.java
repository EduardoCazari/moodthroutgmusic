import java.util.*;

class Main {
  public static void main(String[] args) {

    List<Album> artists = new ArrayList<>();

    OneSizeFitsAll a = new OneSizeFitsAll("Frank Zappa", "One Size Fits All");
    Passages b = new Passages("Philip Glass and Ravi Shankar", "Passages");
    Roots c = new Roots("Sepultura", "Roots");

    a.setMatchingItem1("aged cigars.");
    b.setMatchingItem2("hand crafted incenses from India and deep breathing.");
    c.setMatchingItem3("$2 beers and $3 wells.");

    artists.add(a);
    artists.add(b);
    artists.add(c);
    
    Scanner mood = new Scanner(System.in);

    System.out.println();
    System.out.println("Welcome to Mood Throug Music!" + '\n' +  "Press enter to continue.");
    String enter = mood.nextLine();

    System.out.println("This program will help you to reach a desired mood, sugesting you a full album to listen to while you apreciate something that matches with that music style." + '\n' + "Do you want to try it?" + '\n' + "Type 1 for yes or 2 for no and press enter.");
    int start = mood.nextInt();
    if(start == 1) {
        System.out.println();
        System.out.println("Lets Go!");
    }else{
        System.out.println();
        System.out.println("See you in another moment..."); 
        System.exit(0);
    }

try {    
    System.out.println();    
    System.out.println("What kind of mood do you want to get into?" + '\n' + "For creative,  type 1." + '\n' + "For introspective, type 2." + '\n' + "For expansive, type 3." + '\n' + "Press enter after you select the number.");
    int choiceNumber = mood.nextInt();
    switch(choiceNumber) {
      case 1: System.out.println();
      a.sugestion();
      break;  
      case 2: System.out.println();
      b.sugestion();  
      break; 
      case 3: System.out.println();
      c.sugestion();  
      break;  
    } 
} catch(InputMismatchException e) {
    System.out.println();
    System.out.println("You only have three options to type: 1, 2 or 3. Try again!");
    System.exit(0);
}  

    mood.close();

      for(Album album: artists) {
      System.out.println();
      album.finalMessage();
    }

  }
}

/* 
                            REQUIRIMENTS MAP:

A) 4 Pillars of OOP
P - Inheritance - class OneSizeFitsAll (line 1);
                                    class Passages (line 1);
                                    class Roots (line 1);
         Polymorphism(Overriding) - class OneSizeFitsAll (line 15/23);
                                    class Passages (line 15/23);
                                    class Roots (line 15/23);
                    Encapsulation - class OneSizeFitsAll (line 11/13);
                                    class Passages (line 11/13);
                                    class Roots (line 11/13);
     Abstraction (Abstract class) - class Album (line 1);

B) Constructors (at least 3) - class Album (line 5/7);
                               class OneSizeFitsAll (line 6/9);
                               class Passages (line 6/9);
                               class Roots (line 6/9); 

C) Methods - (Create and invoke at least 4) - class Album (line 9/12);
                                              class OneSizeFitsAll (line 11/23);
                                              class Passages (line 11/23);
                                              class Roots (line 11/23);
                                              class Main (line 43/49 - 60/63);

D) Scanner - class Main - (line 20/58);

E) Switch Statement - class Main - (line 41/51);

F) Exception - class Main - (37/57)

G) Classes (at least 3) - class Main;
                          class Album;
                          class OneSizeFitsAll;
                          class Passages;
                          class Roots; 

H) Colections (ArrayList) - class Main (line 6);

I) Loop - class Main (line 60/63).

*/