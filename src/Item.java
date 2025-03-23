public class Item {

   public String name;
   public String type;
   public String category;
   public String company;
   public int date;
   public int copies;

   public Item () {
   }

   public Item (String name, String type, String category, String company, int date, int copies) {
       this.name = name;
       this.type = type;
       this.category = category;
       this.company = company;
       this.date = date;
       this.copies = copies;
   }

   public String getName() { 
	   return this.name; 
   }
	
   public String getType() {
   	   return this.type;
   }
	
   public String getCategory() {
       return this.category;
   }

   public String getCompany() {
       return this.company;
   }
	
   public int getDate() {
	   return this.date;
   }

   public int getCopies() { 
	   return this.copies; 
   }

   public void setCopies(int x) {
       this.copies -= x; 
   }

   public String toString () {

	   return  "\nType: " + getType()
	           + "\nCategory: " + getCategory()
			   + "\nCompany: " + getCompany()
			   + "\nDate: " + getDate()
               + "\nCopies: " + getCopies();

   }

}
