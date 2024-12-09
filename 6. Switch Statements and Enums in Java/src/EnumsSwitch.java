public class EnumsSwitch {
    public enum Day {
        MONDAY , TUESDAY, WEDNESDAY, 
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public enum CoffeeSize{
        SMALL, MEDIUM, LARGE, VENTI
    }
    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.LARGE;
        double price;
        switch (size) {
            case SMALL:
                price = 2.50;
                break;
            case MEDIUM:
                price = 3.00;
                break;
            case LARGE:
                price = 3.50;
                break;
            case VENTI:
                price = 4.00;
                break;
            default:
                price = 420.69;
                break;
        }
        System.out.println("The price for your coffee is: "+price);
    }
}