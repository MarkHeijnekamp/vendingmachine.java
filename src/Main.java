import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String pizza = String.valueOf(3.50);
//        String monney = String.valueOf(10);
        boolean active = true;
        int pizza = 22;
        int burger = 400;
        int alahuakbar = 100000;
        int monney = 10;
        int choice = 0;
        int tegoed = 0;
        int change = 0;
        int moreMon = 0;
        int moreMMon = 0;
        int totalInput = 0;
//        System.out.println("u heeft " + monney + " $");
//        System.out.println("antwoord met 1 voor ja");
//        System.out.println("antwoord met 2 voor nee");
while (active){
        System.out.println("minimale input is 350 $");
        ArrayList<String> eten = new ArrayList<String>();
        eten.add("Pizza");
        eten.add("Burger");
        eten.add("alahuakbar");
        eten.add("exit");
        System.out.println(eten);

        choice = scanner.nextInt();

        switch (choice){
            case 1: eten.get(0);
            System.out.println("That will be "+ pizza+" $");
            break;
            case 2: eten.get(1);
                System.out.println("That will be "+ burger+" $");
            break;
            case 3: eten.get(2);
                System.out.println("That will be "+ alahuakbar+" $");
            case 4: eten.get(3);
                System.out.println("shutting down");
        }







        totalInput = moreMMon + moreMon + tegoed;
         change = moreMMon + moreMon + tegoed;

        System.out.println("you have total "+ totalInput + " inputted");

        switch (choice){
            case 1:
                System.out.println("Please insert money");
                tegoed = scanner.nextInt();
                if (tegoed < 1){
                    System.out.println("Please insert more coins");
                    moreMMon = scanner.nextInt();

                }
                change = change - pizza;
                if (totalInput == pizza){
                    break;
                }
                while (change < pizza) {
                    if (change > 0 || change == 0) {
                        System.out.println("Your change is: " + change + " $");
                        break;
                    }
                    if (totalInput == pizza){
                        break;
                    }
                    System.out.println(pizza - totalInput+" left");
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    totalInput = totalInput + moreMon ;
                    change = change + moreMon ;




                    System.out.println("you have total "+ totalInput + " inputted");




                }

        if (change > 0) {
            System.out.println("Your change is: " + change + " $");
        } break;


            case 2:
                System.out.println("Please insert money");
                tegoed = scanner.nextInt();
                if (tegoed < 1){
                    System.out.println("Please insert more coins");
                    moreMMon = scanner.nextInt();

                }
                change = change - burger;

                if (totalInput == burger || totalInput > burger){
                    System.out.println("Your change is: " + change + " $");
                    break;
                }

                while (change < burger) {
                    System.out.println(burger - totalInput + " left");
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    totalInput = totalInput + moreMon;
                    change = change + moreMon;

                    System.out.println("you have total " + totalInput + " inputted");


                }
                    if (change > 0 || change == 0) {
                        System.out.println("Your change is: " + change + " $");
                        break;
                    }
                    if (totalInput == burger){
                        break;
                    }

                if (change > 0) {
                    System.out.println("Your change is: " + change + " $");
                } break;

            case 3:
                System.out.println("Please insert money");
                tegoed = scanner.nextInt();
                if (tegoed < 1){
                    System.out.println("Please insert more coins");
                    moreMMon = scanner.nextInt();

                }
                change = change - alahuakbar;
                if (totalInput == alahuakbar){
                    break;
                }
                while (change  != alahuakbar ) {
                    System.out.println(alahuakbar - totalInput+" left");
                    System.out.println("INSERT MORE");
                    moreMon = scanner.nextInt();
                    totalInput = totalInput + moreMon ;
                    change = change + moreMon ;


                    System.out.println("you have total "+ totalInput + " inputted");


        if (change > 0) {
                        System.out.println("Your change is: " + change + " $");
            break;

        }
                    if (totalInput == alahuakbar){
                        break;
                    }

                }
                break;

            case 4:
                active = false;
        }

    }}}
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
// © 2018 Mark Heijnekamp