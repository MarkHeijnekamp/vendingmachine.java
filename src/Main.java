import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String pizza = String.valueOf(3.50);
//        String monney = String.valueOf(10);
        boolean active = true;
        int pizza = 16;
        int burger = 7;
        int apple = 5;
        int monney = 20;
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
    System.out.println("###################################################################################################");
        System.out.println("minimal input is 1 $");
        System.out.println("you have "+monney+ " $");

        ArrayList<String> eten = new ArrayList<String>();
        eten.add("Pizza");
        eten.add("Burger");
        eten.add("apple");
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
                System.out.println("That will be "+ apple+" $");
                break;
            case 4: eten.get(3);
                System.out.println("shutting down");
                active = false;
                break;
        }

//    System.out.println("Please insert money");
//    tegoed = scanner.nextInt();
//    if (tegoed < 1){
//        System.out.println("Please insert more coins");
//        moreMMon = scanner.nextInt();
//
//    }
//
//
//
//
//
//        totalInput = moreMMon + moreMon + tegoed;
//         change = moreMMon + moreMon + tegoed;
//
//        System.out.println("you have total "+ totalInput + " inputted");
    for(String s:eten){

    }

    switch (choice){
        case 1:

            System.out.println("Please insert money");
            tegoed = scanner.nextInt();
            monney = monney - tegoed;

            if (tegoed < 1){
                System.out.println("Please insert more coins");
                moreMMon = scanner.nextInt();
                monney = monney - moreMMon;
            }

            totalInput = moreMMon + moreMon + tegoed;
            change = totalInput;

            System.out.println("you have total "+ totalInput + " inputted");

            change = change - pizza;
//                if (totalInput == pizza){
//                    break;
//                }

//                while (change < pizza) {
//                    if (change > 0) {
//                        System.out.println("Your change is: " + change + " $");
//                        break;
//                    }
            if (totalInput == pizza || totalInput > pizza){
                System.out.println("Your change is: " + change + " $");
                System.out.println("\t\t\t                                     ._\n" +
                        "                                   ,(  `-.\n" +
                        "                                 ,': `.   `.\n" +
                        "                               ,` *   `-.   \\\n" +
                        "                             ,'  ` :+  = `.  `.\n" +
                        "                           ,~  (o):  .,   `.  `.\n" +
                        "                         ,'  ; :   ,(__) x;`.  ;\n" +
                        "                       ,'  :'  itz  ;  ; ; _,-'\n" +
                        "                     .'O ; = _' C ; ;'_,_ ;\n" +
                        "                   ,;  _;   ` : ;'_,-'   i'\n" +
                        "                 ,` `;(_)  0 ; ','       :\n" +
                        "               .';6     ; ' ,-'~\n" +
                        "             ,' Q  ,& ;',-.'\n" +
                        "           ,( :` ; _,-'~  ;\n" +
                        "         ,~.`c _','\n" +
                        "       .';^_,-' ~\n" +
                        "     ,'_;-''\n" +
                        "    ,,~\n" +
                        "    i'\n" +
                        "    :\n");

                break;
            }


//                    if (totalInput == pizza){
//                        break;
//                    }
while(totalInput != pizza) {
    System.out.println(pizza - totalInput + " left");
    System.out.println("INSERT MORE");
    moreMon = scanner.nextInt();
    monney = monney - moreMon;
    totalInput = totalInput + moreMon;
    System.out.println("you have total " + totalInput + " inputted");
}
            System.out.println("\t\t\t                                     ._\n" +
                    "                                   ,(  `-.\n" +
                    "                                 ,': `.   `.\n" +
                    "                               ,` *   `-.   \\\n" +
                    "                             ,'  ` :+  = `.  `.\n" +
                    "                           ,~  (o):  .,   `.  `.\n" +
                    "                         ,'  ; :   ,(__) x;`.  ;\n" +
                    "                       ,'  :'  itz  ;  ; ; _,-'\n" +
                    "                     .'O ; = _' C ; ;'_,_ ;\n" +
                    "                   ,;  _;   ` : ;'_,-'   i'\n" +
                    "                 ,` `;(_)  0 ; ','       :\n" +
                    "               .';6     ; ' ,-'~\n" +
                    "             ,' Q  ,& ;',-.'\n" +
                    "           ,( :` ; _,-'~  ;\n" +
                    "         ,~.`c _','\n" +
                    "       .';^_,-' ~\n" +
                    "     ,'_;-''\n" +
                    "    ,,~\n" +
                    "    i'\n" +
                    "    :\n");

            if (change > 0) {
                System.out.println("Your change is: " + change + " $");
            }
            if (change < 0 || change == 0){
                System.out.println("You get no change");
            }


            break;

case 2:
        System.out.println("Please insert money");
        tegoed = scanner.nextInt();
    monney = monney - tegoed;


    if (tegoed < 1){
            System.out.println("Please insert more coins");
            moreMMon = scanner.nextInt();
            monney = monney - moreMMon;

        }

        totalInput = moreMMon + moreMon + tegoed;
        change = totalInput;

        System.out.println("you have total "+ totalInput + " inputted");

        change = change - burger;
//                if (totalInput == pizza){
//                    break;
//                }

//                while (change < pizza) {
//                    if (change > 0) {
//                        System.out.println("Your change is: " + change + " $");
//                        break;
//                    }
        if (totalInput == burger || totalInput > burger){
            System.out.println("Your change is: " + change + " $");
            System.out.println("                _....----\"\"\"----...._\n" +
                    "             .-'  o    o    o    o   '-.\n" +
                    "            /  o    o    o         o    \\\n" +
                    "           /     o      o   o     o    o \\\n" +
                    "         _|   o   o    o      o  o     o  |_\n" +
                    "        / `''-----.................-----''` \\\n" +
                    "        \\___________________________________/\n" +
                    "          \\~`-`.__.`-~`._.~`-`~.-~.__.~`-`/\n" +
                    "           \\                             /\n" +
                    "            `-._______________________.-'\n" +
                    " ");
            break;
        }

        case 3:

            System.out.println("Please insert money");
            tegoed = scanner.nextInt();
            monney = monney - tegoed;

            if (tegoed < 1){
                System.out.println("Please insert more coins");
                moreMMon = scanner.nextInt();
                monney = monney - moreMMon;
            }

            totalInput = moreMMon + moreMon + tegoed;
            change = totalInput;

            System.out.println("you have total "+ totalInput + " inputted");

            change = change - apple;
//                if (totalInput == pizza){
//                    break;
//                }

//                while (change < pizza) {
//                    if (change > 0) {
//                        System.out.println("Your change is: " + change + " $");
//                        break;
//                    }
            if (totalInput == apple || totalInput > apple){
                System.out.println("Your change is: " + change + " $");
                System.out.println("                        .8 \\n\" +\n" +
                        "                    \"                      .888\\n\" +\n" +
                        "                    \"                    .8888'\\n\" +\n" +
                        "                    \"                   .8888'\\n\" +\n" +
                        "                    \"                   888'\\n\" +\n" +
                        "                    \"                   8'\\n\" +\n" +
                        "                    \"      .88888888888. .88888888888.\\n\" +\n" +
                        "                    \"   .8888888888888888888888888888888.\\n\" +\n" +
                        "                    \" .8888888888888888888888888888888888.\\n\" +\n" +
                        "                    \".&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
                        "                    \"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
                        "                    \"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
                        "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
                        "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
                        "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
                        "                    \"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
                        "                    \"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
                        "                    \"`%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
                        "                    \" `00000000000000000000000000000000000'\\n\" +\n" +
                        "                    \"  `000000000000000000000000000000000'\\n\" +\n" +
                        "                    \"   `0000000000000000000000000000000'\\n\" +\n" +
                        "                    \"     `###########################'\\n\" +\n" +
                        "                    \"       `#######################'\\n\" +\n" +
                        "                    \"         `#########''########'\\n\" +\n" +
                        "                    \"           `\\\"\\\"\\\"\\\"\\\"\\\"'  `\\\"\\\"\\\"\\\"\\\"'\")");


                break;
            }
//
//
////                    if (totalInput == pizza){
////                        break;
////                    }
//
//            System.out.println(apple - totalInput + " left");
//            System.out.println("INSERT MORE");
//            moreMon = scanner.nextInt();
//            monney = monney - moreMon;
//            totalInput = totalInput + moreMon ;
//            System.out.println("you have total "+ totalInput + " inputted");
//            System.out.println("                        .8 \\n\" +\n" +
//                    "                    \"                      .888\\n\" +\n" +
//                    "                    \"                    .8888'\\n\" +\n" +
//                    "                    \"                   .8888'\\n\" +\n" +
//                    "                    \"                   888'\\n\" +\n" +
//                    "                    \"                   8'\\n\" +\n" +
//                    "                    \"      .88888888888. .88888888888.\\n\" +\n" +
//                    "                    \"   .8888888888888888888888888888888.\\n\" +\n" +
//                    "                    \" .8888888888888888888888888888888888.\\n\" +\n" +
//                    "                    \".&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
//                    "                    \"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
//                    "                    \"&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&'\\n\" +\n" +
//                    "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
//                    "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
//                    "                    \"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:\\n\" +\n" +
//                    "                    \"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
//                    "                    \"%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
//                    "                    \"`%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\\n\" +\n" +
//                    "                    \" `00000000000000000000000000000000000'\\n\" +\n" +
//                    "                    \"  `000000000000000000000000000000000'\\n\" +\n" +
//                    "                    \"   `0000000000000000000000000000000'\\n\" +\n" +
//                    "                    \"     `###########################'\\n\" +\n" +
//                    "                    \"       `#######################'\\n\" +\n" +
//                    "                    \"         `#########''########'\\n\" +\n" +
//                    "                    \"           `\\\"\\\"\\\"\\\"\\\"\\\"'  `\\\"\\\"\\\"\\\"\\\"'\")");
//
//            if (change > 0) {
//                System.out.println("Your change is: " + change + " $");
//            }
//            if (change < 0 || change == 0){
//                System.out.println("You get no change");
//            }
//
//            break;
//
//
////            case 2:
////                System.out.println("Please insert money");
////                tegoed = scanner.nextInt();
////                if (tegoed < 1){
////                    System.out.println("Please insert more coins");
////                    moreMMon = scanner.nextInt();
////
////                }
////
////
////
////
////
////                totalInput = moreMMon + moreMon + tegoed;
////                change = moreMMon + moreMon + tegoed;
////
////                System.out.println("you have total "+ totalInput + " inputted");
////
////                change = change - burger;
////
////                if (totalInput == burger || totalInput > burger){
////                    System.out.println("Your change is: " + change + " $");
////                    break;
////                }
////
////                while (totalInput < burger) {
////                    System.out.println(burger - totalInput + " left");
////                    System.out.println("INSERT MORE");
////                    moreMon = scanner.nextInt();
////                    totalInput = totalInput + moreMon;
////                    change = change + moreMon;
////
////                    System.out.println("you have total " + totalInput + " inputted");
////
//
//                }
//                    if (change > 0 || change == 0) {
//                        System.out.println("Your change is: " + change + " $");
//                        break;
//                    }
////                    if (totalInput == burger){
////                        break;
////                    }
//
//                if (change > 0) {
//                    System.out.println("Your change is: " + change + " $");
//
//                } break;
//
//            case 3:
//                System.out.println("Please insert money");
//                tegoed = scanner.nextInt();
//                if (tegoed < 1){
//                    System.out.println("Please insert more coins");
//                    moreMMon = scanner.nextInt();
//
//                }
//
//                totalInput = moreMMon + moreMon + tegoed;
//                change = moreMMon + moreMon + tegoed;
//
//                System.out.println("you have total "+ totalInput + " inputted");
//
//                change = change - apple;
////                if (totalInput == apple){
////                    break;
////                }
//                if (totalInput == apple || totalInput > apple){
//                    System.out.println("Your change is: " + change + " $");
//                    System.out.println("                             ___\n" +
//                            "                          _/`.-'`.\n" +
//                            "                _      _/` .  _.'\n" +
//                            "       ..:::::.(_)   /` _.'_./\n" +
//                            "     .oooooooooo\\ \\o/.-'__.'o.\n" +
//                            "    .ooooooooo`._\\_|_.'`oooooob.\n" +
//                            "  .ooooooooooooooooooooo&&oooooob.\n" +
//                            " .oooooooooooooooooooo&@@@@@@oooob.\n" +
//                            ".ooooooooooooooooooooooo&&@@@@@ooob.\n" +
//                            "doooooooooooooooooooooooooo&@@@@ooob\n" +
//                            "doooooooooooooooooooooooooo&@@@oooob\n" +
//                            "dooooooooooooooooooooooooo&@@@ooooob\n" +
//                            "dooooooooooooooooooooooooo&@@oooooob\n" +
//                            "`dooooooooooooooooooooooooo&@ooooob'\n" +
//                            " `doooooooooooooooooooooooooooooob'\n" +
//                            "  `doooooooooooooooooooooooooooob'\n" +
//                            "   `doooooooooooooooooooooooooob'\n" +
//                            "    `doooooooooooooooooooooooob'\n" +
//                            "     `doooooooooooooooooooooob'\n" +
//                            "      `dooooooooobodoooooooob'\n" +
//                            "       `doooooooob dooooooob'\n" +
//                            "         `\"\"\"\"\"\"\"' `\"\"\"\"\"\"'");
//break;
//
//                }
//                while (change  != apple ) {
//                    System.out.println(apple - totalInput+" left");
//                    System.out.println("INSERT MORE");
//                    moreMon = scanner.nextInt();
//                    totalInput = totalInput + moreMon ;
//                    change = change + moreMon ;
//
//
//                    System.out.println("you have total "+ totalInput + " inputted");
//
//
//
//                }
//
//                break;
//
//
//        }
//    monney = monney + change - totalInput ;
    }}}}
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