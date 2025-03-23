import java.util.*;

public class AvailableCat {

//   Scanner sc = new Scanner (System.in);
   private ArrayList <Item> items = new ArrayList <Item> ();

   RentedCat objRent = new RentedCat();
   utils ut = new utils ();

//   String answerType, answerName;
//   boolean foundName;

   Movie Matrix = new Movie ("Matrix", "DVD", "Action/Sci-Fi", "WB", 1999, 40, "Wachowski", "Wachowski", "Keanu Reeves/Laurence Fishburne/Carrie-Anne Moss", 136);
   Movie HarryPotter = new Movie ("Harry Potter", "DVD", "Fantasy/Drama/Thriller", "Bloomsbury Publishing", 2001, 70, "Chris Colombus", "Steve Kloves", "Daniel Radcliffe/Rupert Grint /Richard Harris", 152);
   Movie TombRaider = new Movie ("Tomb Raider", "DVD", "Action/Adventure/Fantasy/Thriller", "WB", 2018, 50, "Roar Uthaug", "Geneva Robertson-Dworet", "Alicia Vikander/Dominic West/Walton Goggins", 119);
   Movie LOTR = new Movie ("LOTR", "Blue Ray", "Adventure/Drama/Fantasy", "WingNut Films", 2001, 35, "Peter Jackson", "JRR Tolkien", "Sean Austin/Sala Baker/Sean Bean", 178);
   Movie StarWars = new Movie ("Star Wars", "Blue Ray", "Action/Adventure/Fantasy/Sci-Fi", "Walt Disney Pictures", 2015, 80, "J.J Abrams", "Lawrance Kasdan", "Daisy Ridley/John Boyega/Oscar Isaac", 136);
   Movie Mechanic = new Movie ("Mechanic: Resurrection", "Blue Ray", "Action/Adventure/Thriller", "Millenium Films", 2016, 60,  "Dennis Gansel", "Philip Shelby", "Jason Statham/Jessica Alba/Sam Hadeldine", 98);
   Game Uncharted = new Game ("Uncharted", "PS", "Action/Adventure", "Naughty Dog", 2007, 40);
   Game GranTurismo = new Game ("Gran Turismo Sport", "PS", "Racing", "Sony Interactive Entertainment", 2017, 70);
   Game RDR2 = new Game ("RDR2", "PS", "Action/Adventure", "Rockstar Games", 2018,110);
   Game GOW = new Game ("God Of War", "PS", "Action/Adventure", "Sony Interactive Entairtainment", 2005, 25);
   Game LOZ = new Game ("The Legend Of Zelda", "Nintendo", "Action/Adventure", "Nintendo", 2017, 55);
   Game Pokemon = new Game ("Pokemon", "Nintendo", "Role-Playing", "Nintendo", 2006, 30);
   Game Mario = new Game ("Mario", "Nintendo", "Arcade", "Nintendo", 1985, 180);
   Game DonkeyKong = new Game ("Donkey Kong", "Nintendo", "Platformer", "Nintendo", 1981, 100);
   Game Division = new Game ("The Division 2", "XBOX", "Third Person Shooter/Action", "Ubisoft", 2019, 150);
   Game GTAV = new Game ("Grand Theft Auto V", "XBOX", "Adventure/Action", "Rockstar Games", 2013, 120);
   Game Halo = new Game ("Halo", "XBOX", "Action/Adventure", "XBOX", 2001, 22);
   Game ForzaHorizon = new Game ("Forza Horizon 4", "XBOX", "Racing", "Xbox Game Studios", 2018, 200);
	
   public AvailableCat() {

       items.add(Matrix);
       items.add(HarryPotter);
       items.add(TombRaider);
       items.add(LOTR);
       items.add(StarWars);
       items.add(Mechanic);
       items.add(Uncharted);
       items.add(GranTurismo);
       items.add(RDR2);
       items.add(GOW);
       items.add(LOZ);
       items.add(Pokemon);
       items.add(Mario);
       items.add(DonkeyKong);
       items.add(Division);
       items.add(GTAV);
       items.add(Halo);
       items.add(ForzaHorizon);

   }

   public void getMovie() {

       Item m = new Item ();

       //Elegxos gia dvd h br mono!
       //Dwse typo tainias: DVD
       String answerType = ut.typeCheckM();

       //Emfanhsh olwn twn ekastote items
       System.out.println();
       for (Item i : items) { if (i.getType().equals(answerType)) { System.out.println(i.getName()); } }

       //Dwse sygkekrimmenh tainia: Matrix
       m = ut.itemCheck(items, "Movie");

       //Enoikiash ths tainias
       objRent.rentItem(m);

   }//getMovie();

   public void getGame() {

       Item g = new Item ();

       //Elegxos gia PS h Nintendo h XBOX mono!
       //Dwse typo paixnidiou: PS
       String answerType = ut.typeCheckG();

       //Emfanhsh olwn twn ekastote items
       System.out.println();
       for (Item i : items) { if (i.getType().equals(answerType)) { System.out.println(i.getName()); } }

       //Dwse sygkekrimmeno paixnidi: Uncharted
       g = ut.itemCheck(items, "Game");

       //Enoikiash tou paixnidiou
       objRent.rentItem(g);

   }//getGame();
	
}
