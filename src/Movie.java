public class Movie extends Item {

   private String director;
   private String writer;
   private String cast;
   private int length;

   public Movie (String name, String type, String category, String company, int date, int copies, String director, String writer, String cast, int length) {
       super (name, type, category, company, date, copies);
       this.director = director;
       this.writer = writer;
       this.cast = cast;
       this.length = length;
   }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getCast() {
        return cast;
    }

    public int getLength() {
        return length;
    }

    public String toString () {

        return  super.toString()
                + "\nDirector: " + getDirector()
                + "\nWriter: " + getWriter()
                + "\nCast: " + getCast()
                + "\nLength: " + getLength() + " min";

    }

}
