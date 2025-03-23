import java.util.*;

public class utils {

	public utils() {
	}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String typeCheckM() {

		Scanner sc = new Scanner (System.in);
		String answerType;

		System.out.print("\nDwse typo tainias (DVD/Blue Ray): ");
		answerType = sc.nextLine();

		while (!(answerType.equals("DVD") || answerType.equals("Blue Ray"))) {

			System.out.println("\nLathos eisagwgh stoixeiwn!");
			System.out.print("Dwse typo tainias (DVD/Blue Ray): ");
			answerType = sc.nextLine();

		}

		return answerType;

	}//typeCheckM();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public String typeCheckG() {

		Scanner sc = new Scanner (System.in);
		String answerType;

		System.out.print("\nDwse typo paixnidou (PS/Nintendo/XBOX): ");
		answerType = sc.nextLine();

		while (!(answerType.equals("PS") || answerType.equals("Nintendo") || answerType.equals("XBOX"))) {

			System.out.println("\nLathos eisagwgh stoixeiwn!");
			System.out.print("Dwse typo paixnidou (PS/Nintendo/XBOX): ");
			answerType = sc.nextLine();

		}

		return answerType;

	}//typeCheckG();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public int copiesCheck (int copies) {

		Scanner sc = new Scanner (System.in);

		System.out.print("\nDwse ari8mo antitupwn gia enoikiash: ");
		int rentCopies = Integer.parseInt(sc.nextLine());

		while (rentCopies > copies || rentCopies < 1) {
			System.out.println("Lathos eisagwgh stoixeiwn!");
			System.out.print("\nDwse ari8mo antitupwn gia enoikiash: ");
			rentCopies = Integer.parseInt(sc.nextLine());
		}

		return rentCopies;

	}//copiesCheck();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Item itemCheck(ArrayList <Item> items, String type) {

		Scanner sc = new Scanner (System.in);
		Item temp = new Item ();

		//Arxikopoihsh metavlhtwn
		boolean foundName = false;
		String answerName = "";

		//Anazhthsh tainias gia enoikhash
		while (! foundName) {

			if (type.equals("Movie")) {

				if (!answerName.equals("")) {

					System.out.println("\nLathos eisagwgh stoixeiwn!");
					System.out.print("Dwse sygkekrimmeni tainia: ");

				} else { System.out.print("\nDwse sygkekrimmeni tainia: "); }

			} else {

				if (!answerName.equals("")) {

					System.out.println("\nLathos eisagwgh stoixeiwn!");
					System.out.print("Dwse sygkekrimmeno paixnidi: ");

				} else { System.out.print("\nDwse sygkekrimmeno paixnidi: "); }

			}

			answerName = sc.nextLine();

			for (Item i : items) {

				if (i.getName().equals(answerName)) {
					foundName = true;

					if (type.equals("Movie")) {

                        //Plhrofories gia thn ekastote tainia
                        System.out.println(((Movie) i).toString());

                    } else {

                        //Plhrofories gia to ekastote paixnidi
                        System.out.println(((Game) i).toString());

                    }


					temp = i;

				}

			}

		}

		return temp;

	}//itemCheck();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int codeCheck (ArrayList <Rent> rentals) {

	    Scanner sc = new Scanner (System.in);
	    int answerInt;
        boolean found = false;

        do {

            System.out.println("\nEpilekse enoikiash bash KWDIKOU:");
            for (Rent i : rentals) {

            	if (! (i.isRemove()) ) {
					System.out.println("#" + i.getRentCode());
				}
            }

            System.out.print("\n> #");
            answerInt = Integer.parseInt(sc.nextLine());

            for (Rent i : rentals) { if (i.getRentCode() == answerInt) { found = true; } }

            if (! found) { System.out.println("\nLathos eisagwgh stoixeiwn!"); }

        } while (! found);

        return answerInt;

    }//codeCheck();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public int checkRentDays (Rent i) {

	    Scanner sc = new Scanner (System.in);
	    boolean done = false;
	    int answerInt, x;

		System.out.println("\nOi tainies 'DVD' teleutaias kukloforias kai oi tainies 'Blue Ray'");
		System.out.println("enoikiazontai mono me thn HMERA!");

		System.out.println("\nOi tainies 'DVD' palias kukloforias kai ta paixnidia");
		System.out.println("enoikiazontai mono me thn EVDOMADAS!");

		if ( (((Item) i).getType().equals("DVD") && ((Item) i).getDate() > 2015) || ((Item) i).getType().equals("Blue Ray") ) {

			System.out.print("\nDwse hmeres sunolikhs enoikiashs: ");
			answerInt = Integer.parseInt(sc.nextLine());

		} else {

			System.out.print("\nDwse evdomades sunolikhs enoikiashs: ");
			x = Integer.parseInt(sc.nextLine());
			answerInt = x * 7;

		}

        return answerInt;

    }//chechRentDays();

}
