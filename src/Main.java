import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String pizza = String.valueOf(3.50);
//        String monney = String.valueOf(10);

        int pizza = 350;
        int burger = 400;
        int alahuakbar = 100000;
        int monney = 1000;
        int choice = 0;
        int tegoed = 0;
        int change = 0;
        int moreMon = 0;
//        System.out.println("u heeft " + monney + " cent");
//        System.out.println("antwoord met 1 voor ja");
//        System.out.println("antwoord met 2 voor nee");

        System.out.println("minimale input is 350 cent");
        ArrayList<String> eten = new ArrayList<String>();
        eten.add("Pizza");
        eten.add("Burger");
        eten.add("alahuakbar");
        System.out.println(eten);

        choice = scanner.nextInt();

        switch (choice){
            case 1: eten.get(0);
            System.out.println("That will be 350 cent");
            break;
            case 2: eten.get(1);
            System.out.println("That will be 400 cent");
            break;
            case 3: eten.get(2);
            System.out.println("That will be 100000 cent");
        }
        System.out.println("Please insert currency");
        tegoed = scanner.nextInt();


        if (tegoed < 350){
            System.out.println("Please insert more coins");
            tegoed = scanner.nextInt();
        }

        switch (choice){
            case 1:
                change = moreMon + tegoed - pizza;
                while (change > 0) {
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    change = moreMon + tegoed - pizza;



                }
                System.out.println("Your change is: " + change + " cent");
                break;

            case 2:
                change = moreMon + tegoed - burger;
                while (change < 0) {
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    change = moreMon + tegoed - pizza;



                }
                System.out.println("Your change is: " + change + " cent");
                break;

            case 3:
                change = moreMon + tegoed - alahuakbar;
                while (change < 0) {
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    change = moreMon + tegoed - pizza;


                }
                System.out.println("Your change is: " + change + " cent");
                break;
        }

    }}
//
//        System.out.println("wil je wat eten ?");
//        System.out.println();
//        String qeust1 = scanner.nextLine();
//        if ((qeust1).equals("y")) {
//
//            System.out.println("wil je iets warms eten ?");
//            System.out.println();
//            String qeust2 = scanner.nextLine();
//
//
//            if ((qeust2).equals("y")) {
//
//                System.out.println("wil je iets uit de oven ?");
//                System.out.println();
//                String qeust4 = scanner.nextLine();
//
//            if ((qeust4).equals("y")) {
//
//                System.out.println("wil je een pizza ?");
//                System.out.println();
//                String q5 = scanner.nextLine();
//
//            if ((q5).equals("y")) {
//                System.out.println("u heeft " + monney + " $");
//
//                System.out.println("alstublieft pizza salami");
//                System.out.println("dat is dan 3,50$");
//                int newmonney = String.valueOf(monney - pizza);
//                System.out.println("u heeft nog" + newmonney + " $");
//
//            }
//            }
//            }
//        }
//
//
//                System.out.println("wil je iets met ijs er in ?");
//            System.out.println();
//            String q3 = scanner.nextLine();
//        if ((q3).equals("y")) {
//
//            System.out.println("Alstublieft ben en jerry ijs");
//            System.out.println("dat is dan 7,00$");
//
//        }
//        if ((q3).equals("n")) {
//
//            System.out.println("wil je junkfood ?");
//            System.out.println();
//            String q6 = scanner.nextLine();
//            if ((q6).equals("y")) {
//                System.out.println("wil je chips ?");
//                System.out.println();
//                String q7 = scanner.nextLine();
//                if ((q6).equals("y")){
//                    System.out.println("alstublieft uw lay's chips");
//                    System.out.println("dat is dan 10,00$");
//                }
//                if ((q6).equals("n")) {
//                    System.out.println("wil een hamburger ?");
//                    System.out.println();
//                    String q8 = scanner.nextLine();
//                }
//            }
//
//
//
//
//
//
//    }}}
//
//
//
//
