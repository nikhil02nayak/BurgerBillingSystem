import java.util.Scanner;

public class Burgerbilling {



    public static void main(String[] args) {

        System.out.println("Welcome to Star burger services");
        System.out.println("Which burger would you want to have");
        System.out.println("1.basehamburger");
        System.out.println("2.healthyburger");
        Scanner typeofburgerselected = new Scanner(System.in);
        int select = typeofburgerselected.nextInt() ;
        switch (select)
        {
            case 1 :
                int total  ;
                System.out.println("u have selected basehamburger ");
                System.out.println("select your rolltype ==>");
                System.out.println("Available options are\nplain\nsesame seed\nenglish muffin\nsliced bread\nkaiser roll");
                System.out.println("");
                System.out.println("Enter your choice");
                Scanner scanner = new Scanner(System.in) ;
                String choice = scanner.nextLine();
                Basehamburger basehamburger = new Basehamburger() ;
                basehamburger.setRolltype(choice);
                int rolltypecost = basehamburger.priceofrolltype();
                System.out.println("");
                System.out.println("Would want to have meat in the burger\nType true if required\nType false if not required");
                boolean VegorNonveg = scanner.nextBoolean() ;
                scanner.nextLine() ;
                int meatcost ;

                if(VegorNonveg)
                {
                    System.out.println("");
                    System.out.println("select your meattype ==>");
                    System.out.println("Available options are\nbrisket\nchuck\ngrass-fed\nwagyu\nsirloin");
                    System.out.println("");
                    System.out.println("Enter your choice");
                    String choiceofmeat = scanner.nextLine();
                    basehamburger.setMeat(choiceofmeat);
                    meatcost = basehamburger.priceofmeat() ;
                }
                else {
                    meatcost = 0 ;
                }

                System.out.println("");

                System.out.println("Is addon required \nIf yes type true\nIf no type false");
                boolean addonrequired = scanner.nextBoolean();
               int addoncost = basehamburger.addtionalsRequired(addonrequired) ;

                total = rolltypecost + meatcost + addoncost ;
                System.out.println("");
                System.out.println("Grand Total = " + total);
                break;

            case 2 :
                System.out.println("u have selected Healthyburger ");
                System.out.println("select your rolltype ==>");
                System.out.println("Available options are\nplain\nsesame seed\nenglish muffin\nsliced bread\nkaiser roll");
                System.out.println("");
                System.out.println("Enter your choice");
                Scanner scanner1 = new Scanner(System.in) ;
                String choice1 = scanner1.nextLine();
                Healthyburger healthyburger = new Healthyburger() ;
                healthyburger.setRolltype(choice1);
                int rolltypecost1 = healthyburger.priceofrolltype();
                System.out.println("");
                System.out.println("Would want to have meat in the burger\nType true if required\nType false if not required");
                boolean VegorNonveg1 = scanner1.nextBoolean() ;
                scanner1.nextLine() ;
                int meatcost1 ;

                if(VegorNonveg1)
                {
                    System.out.println("");
                    System.out.println("select your meattype ==>");
                    System.out.println("Available options are\nbrisket\nchuck\ngrass-fed\nwagyu\nsirloin");
                    System.out.println("");
                    System.out.println("Enter your choice");
                    String choiceofmeat = scanner1.nextLine();
                    healthyburger.setMeat(choiceofmeat);
                    meatcost1 = healthyburger.priceofmeat() ;
                }
                else {
                    meatcost1 = 0 ;
                }

                //System.out.println("");

                System.out.println("Is addon required \nIf yes type true\nIf no type false");
                boolean addonrequired1 = scanner1.nextBoolean();
                int addoncost1 = healthyburger.addtionalsRequired(addonrequired1) ;
                int addoncost2 = healthyburger.addonforhealthyburger();

                total = rolltypecost1 + meatcost1 + addoncost1 + addoncost2 ;
                System.out.println("");
                System.out.println("Grand Total = " + total);
                break;

        }

    }
}
