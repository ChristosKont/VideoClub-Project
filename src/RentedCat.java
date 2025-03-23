import java.util.*;

public class RentedCat {

    Scanner sc = new Scanner (System.in);
    public static ArrayList <Rent> rentals = new ArrayList <Rent> ();
    public int code = 5037;
    utils ut = new utils ();



    public void rentItem(Item i) {

        //Dhmiourgia antikeimenou typou Rent kai arxhikopoihsh xarakthristikwn
        Rent rentItem = new Rent (i.getName(), i.getType(), i.getCategory(), i.getCompany(), i.getDate(), 0, code, "", 0, 0, 0, 0, 0, 0, false);
        double rentCost = 1;
        int rentDays;

        int rentCopies = ut.copiesCheck(i.getCopies());
        i.setCopies(rentCopies);
        rentItem.setRentCopies(rentCopies);

        System.out.print("Dwse onomatoepwnumo kai thl: ");
        rentItem.setRentID(sc.nextLine());

        System.out.print("Dwse hmera enoikiashs(DD): ");
        rentItem.setRentDD(Integer.parseInt(sc.nextLine()));

        System.out.print("Dwse mhna enoikiashs(MM): ");
        rentItem.setRentMM(Integer.parseInt(sc.nextLine()));

        rentDays = ut.checkRentDays(rentItem);
        rentItem.setRentDays(rentDays);

        //Ananewsh kwdikou enoikiashs
        code += 1;

        //Ypologismos kostous
        rentCost = rentItem.getRentCopies() * rentItem.getRentDays() * 0.5;
        rentItem.setRentCost(rentCost);

        //Perasma enoikiashs sthn ArrayList
        rentals.add(rentItem);

    }//rentItem();

    public void getRentals() {

        Scanner sc = new Scanner (System.in);
        String answer = "";
        int answerRentDD, answerRentMM;
        double rentXCost, estimated, xcost, fcost;
        double mul = 0;

        int answerInt = ut.codeCheck(rentals);

        //Emfanish stoixeiwn antikeimenou
        for (Rent i : rentals) { if (i.getRentCode() == answerInt) { System.out.println(i); } }

        do {

            if (!answer.equals("")) { System.out.println("Lathos eisagwgh stoixeiwn!"); }

            System.out.print("\nThes na epistrepseis to parapanw proion(Nai/Oxi)? ");
            answer = sc.nextLine();

        } while (! (answer.equals("Nai") || answer.equals("Oxi")) );

        if (answer.equals("Nai")) {

            System.out.print("\nDwse hmera paradoshs(DD): ");
            answerRentDD = Integer.parseInt(sc.nextLine());
            System.out.print("Dwse mhna paradoshs(MM): ");
            answerRentMM = Integer.parseInt(sc.nextLine());

            for (Rent i : rentals) {

                if (i.getRentCode() == answerInt) {

                    estimated = (answerRentDD + answerRentMM * 30) - (i.getRentDD() + i.getRentMM() * 30 + i.getRentDays());

                    //Ypologismos epipleon kostous
                    if (estimated > 0) {
                        mul = estimated / 100;          //To efere arga --> Extra xrewsh
                    } else {
                        mul = estimated / 100;          //To efere nwris --> Ekptwsh
                    }

                    //Orismos epipleon kostous
                    xcost = mul * i.getRentCost();
                    //round(xcost, 2);
                    i.setRentXCost(xcost);

                    fcost = i.getRentXCost() + i.getRentCost();

                    System.out.println("\nArxiko kostos: " + i.getRentCost());
                    System.out.println("Epipleon kostos: " + i.getRentXCost());
                    System.out.println("--------------------");
                    System.out.println("Teliko kostos: " + fcost);

                    i.setRemove(true);

                }

                //Topo8ethsh enoikiasewn pisw
                ((Item) i).setCopies(-i.getRentCopies());

            }

        }

    }//getRentals();

}