public class EnumsAndSwitch {

    public enum ComputerType{
        SMARTPHONE, TABLET, LAPTOP, DESKTOP
    }
    public static void main(String[] args) {

        ComputerType myComputerType = ComputerType.TABLET;

        String description = switch (myComputerType) {
            case ComputerType.SMARTPHONE -> "Smart phones offer computing power in your hand.";
            case ComputerType.TABLET -> "Tablet are lightweight fror browsing and light tasks.";
            case ComputerType.LAPTOP -> "Laptops are portable for work on the go.";
            case ComputerType.DESKTOP -> "Desktops excels in gaming and work related tasks.";
            default -> "Unknown computer type.";
        };
        System.out.println(description);
    }
}