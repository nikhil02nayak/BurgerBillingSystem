import java.util.Scanner;

public class Healthyburger extends Basehamburger{

//    public static void main(String[] args) {
//        Basehamburger basehamburger = new Basehamburger("pLain","Brisket","nikhil") ;
//        int totalcost = basehamburger.priceofmeat() + basehamburger.priceofrolltype() ;
//        System.out.println(basehamburger.priceofmeat());
//       System.out.println(basehamburger.priceofrolltype());
//        System.out.println(totalcost);
//    }

    @Override
    public void setRolltype(String rolltype) {
        super.setRolltype(rolltype);
    }

    @Override
    public void setMeat(String meat) {
        super.setMeat(meat);
    }

    public Healthyburger()
    {

    }
    public Healthyburger(String rolltype, String meat, String name) {
        super(rolltype, meat, name);
    }

    @Override
    public int priceofrolltype() {
        return super.priceofrolltype();
    }

    @Override
    public int priceofmeat() {
        return super.priceofmeat();
    }

    @Override
    public int addtionalsRequired(boolean addtionalsRequired) {

        int addonpriceforhelathyburger ;

        Scanner typeofaddtionalrequired1 = new Scanner(System.in) ;
        String addonforhealthyburger = typeofaddtionalrequired1.nextLine().toLowerCase();
        return super.addtionalsRequired(addtionalsRequired);

    }

    public int addonforhealthyburger ()
    {
        System.out.println("Two addtional add on available for Healthy burger:\nAvocado\nChillies");
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine().toLowerCase();
        if(choice == "avocado")
        {
            return (price = 80) ;
        }
        else
        {
            return (price = 75) ;
        }
    }

}
