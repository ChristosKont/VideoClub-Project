public class Rent extends Item {

   private int rentCode;
   private String rentID;
   private int rentDD;
   private int rentMM;
   private int rentDays;
   private double rentCost;
   private double rentXCost;
   private int rentCopies;
   private boolean isRemove;

   public Rent (String name, String type, String category, String company, int date, int copies, int rentCode, String rentID, int rentDD, int rentMM, int rentDays, double rentCost, double rentXCost, int rentCopies, boolean isRemove) {

       super(name, type, category, company, date, copies);
       this.rentCode = rentCode;
       this.rentID = rentID;
       this.rentDD = rentDD;
	   this.rentMM = rentMM;
       this.rentDays = rentDays;
       this.rentCost = rentCost;
       this.rentXCost = rentXCost;
       this.rentCopies = rentCopies;
       this.isRemove = isRemove;

   }

    public int getRentCode() {
        return rentCode;
    }

    public void setRentCode(int rentCode) {
        this.rentCode = rentCode;
    }

    public String getRentID() {
        return rentID;
    }

    public void setRentID(String rentID) {
        this.rentID = rentID;
    }

    public int getRentDD() {
        return rentDD;
    }

    public void setRentDD(int rentDD) {
        this.rentDD = rentDD;
    }
	
	public int getRentMM() {
        return rentMM;
    }

    public void setRentMM(int rentMM) {
        this.rentMM = rentMM;
    }

    public int getRentDays() { return rentDays; }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public double getRentXCost() {
        return rentXCost;
    }

    public void setRentXCost(double rentXCost) {
        this.rentXCost = rentXCost;
    }

    public int getRentCopies() { return rentCopies; }

    public void setRentCopies(int rentCopies) { this.rentCopies = rentCopies; }

    public boolean isRemove() { return isRemove; }

    public void setRemove(boolean remove) { isRemove = remove; }

    public String toString () {
		
       return  "\nKwdikos enoikiashs: #" + getRentCode()
               + "\nEnoikiazomeno proion: " + super.getName()
               + "\nOnoma kai thl: " + getRentID()
               + "\nHmeromhnia enoikiashs: " + getRentDD() + "/" + getRentMM()
			   + " gia " + getRentDays() + " meres"
               + "\nAntintupa: " + getRentCopies()
               + "\nKostos enoikhashs: " + getRentCost();
			   
    }

}