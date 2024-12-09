public class SwitchStatements {
    public static void main(String[] args) {
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Work on Project A");
                break;
            case 2:
                System.out.println("Work on Project B");
                break;
            case 3:
                System.out.println("Wednesday: Write proposal");
                break;
            case 4:
                System.out.println("Thursday: Meeting all day");
                break;
            case 5:
                System.out.println("Friday: Submit a report");
                break;
            case 6:
                System.out.println("Saturday: Relax");
                
            case 7:
                System.out.println("Sunday: Relax");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}