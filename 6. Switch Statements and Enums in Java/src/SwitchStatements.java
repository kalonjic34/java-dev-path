public class SwitchStatements {
    public static void main(String[] args) {
        // int day = 9;
        // int day = 2;
        int day = 5;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
        
            default:
                dayName = "N/A";
                break;
        }
        System.out.println("Today is "+dayName);
    }
}