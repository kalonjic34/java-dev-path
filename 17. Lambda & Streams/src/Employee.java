public class Employee {
    private int id;
    private String firstName;
    private int yearsOfService;


    public Employee(int id, String firstName, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.yearsOfService = yearsOfService;
    }


    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getYearsOfService() {
        return this.yearsOfService;
    }

}