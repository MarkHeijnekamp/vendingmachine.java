import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizza = String.valueOf(3.50);
        String monney = String.valueOf(10);
        System.out.println("u heeft " + monney + " $");
        System.out.println("antwoord met Y voor ja");
        System.out.println("antwoord met N voor nee");

        System.out.println("wil je wat eten ?");
        System.out.println();
        String qeust1 = scanner.nextLine();
        if ((qeust1).equals("y")) {

            System.out.println("wil je iets warms eten ?");
            System.out.println();
            String qeust2 = scanner.nextLine();


            if ((qeust2).equals("y")) {

                System.out.println("wil je iets uit de oven ?");
                System.out.println();
                String qeust4 = scanner.nextLine();

            if ((qeust4).equals("y")) {

                System.out.println("wil je een pizza ?");
                System.out.println();
                String q5 = scanner.nextLine();

            if ((q5).equals("y")) {
                System.out.println("u heeft " + monney + " $");

                System.out.println("alstublieft pizza salami");
                System.out.println("dat is dan 3,50$");
                String newmonney = String.valueOf(monney - pizza);
                System.out.println("u heeft nog" + newmonney + " $");

            }
            }
            }
        }


                System.out.println("wil je iets met ijs er in ?");
            System.out.println();
            String q3 = scanner.nextLine();
        if ((q3).equals("y")) {

            System.out.println("Alstublieft ben en jerry ijs");
            System.out.println("dat is dan 7,00$");

        }
        if ((q3).equals("n")) {

            System.out.println("wil je junkfood ?");
            System.out.println();
            String q6 = scanner.nextLine();
            if ((q6).equals("y")) {
                System.out.println("wil je chips ?");
                System.out.println();
                String q7 = scanner.nextLine();
                if ((q6).equals("y")){
                    System.out.println("alstublieft uw lay's chips");
                    System.out.println("dat is dan 10,00$");
                }
                if ((q6).equals("n")) {
                    System.out.println("wil een hamburger ?");
                    System.out.println();
                    String q8 = scanner.nextLine();
                }
            }






    }}}




