import java.util.Scanner;

public class Basehamburger {

    private String rolltype ;
    private String meat ;
     int price ;
    private String name ;

    public Basehamburger()
    {

    }

    public Basehamburger(String rolltype, String meat, String name) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.name = name;
    }

    public void setRolltype(String rolltype) {
        this.rolltype = rolltype;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRolltype() {
        return rolltype;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int priceofrolltype()
    {
        int priceofrolltype ;
        switch (rolltype.toLowerCase())
        {
            case "plain"   :
                this.price = 80 ;
               return priceofrolltype = this.price ;


            case "sesame seed" :
              this.price = 70 ;
                return priceofrolltype = this.price ;


            case "english muffin" :
                this.price = 90 ;
                return priceofrolltype = this.price ;


            case "sliced bread" :
             this.price = 60 ;
                return priceofrolltype = this.price ;


            case "kaiser roll" :
             this.price = 75 ;
                return priceofrolltype = this.price ;


            default:
                return priceofrolltype = 0 ;
        }


    }

    public int priceofmeat()
    {
        int priceofmeat ;
        switch (meat.toLowerCase())
        {
            case "brisket" :
                this.price = 90 ;
                return priceofmeat = this.price ;


            case "chuck" :
                this.price = 60 ;
                return priceofmeat = this.price ;


            case "grass-fed" :
                this.price = 60 ;
                return priceofmeat = this.price ;


            case "wagyu" :
                this.price = 120 ;
                return priceofmeat = this.price ;


            case "sirloin" :
                this.price = 75 ;
                return priceofmeat = this.price ;


            default:
                return priceofmeat = 0 ;
        }


    }

    public int addtionalsRequired(boolean addtionalsRequired)
    {
        int priceofextraAddon ;
        if (addtionalsRequired)
        {

            Scanner typeofaddtionalrequired = new Scanner(System.in) ;
            System.out.println("Enter your addon type,below are your available option\nlettuce\ntomato\ncarrot\ncucumber");
            String addon = typeofaddtionalrequired.nextLine();
            switch (addon.toLowerCase())
            {
                case "lettuce" :
                    this.price = 30 ;
                    return priceofextraAddon = this.price ;

                case "tomato" :
                    this.price = 20 ;
                    return priceofextraAddon = this.price ;

                case "carrot" :
                    this.price = 15 ;
                    return priceofextraAddon = this.price ;

                case  "cucumber" :
                    this.price = 25 ;
                    return priceofextraAddon = this.price ;

                default:
                    return priceofextraAddon = 0 ;

            }
        }

        else {
            return  priceofextraAddon = 0 ;
        }
    }







}
