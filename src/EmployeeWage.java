public class EmployeeWage {
    static int status;
    static int RATE_PER_HOUR;
    static int wage = 0;
    final static int PART_TIME = 0;
    final static int FULL_TIME = 1;
    static int emphours;

    EmployeeWage() {
        RATE_PER_HOUR = 20;
    }

    static int isPresent() {
        status = (int) (Math.random() * 10) % 3;
        switch (status) {
            case FULL_TIME:
                emphours = 8;
                break;
            case PART_TIME:
                emphours = 4;
                break;
            default:
                emphours = 0;
        }
        return emphours;
    }

    public static void main(String[] args) {

        EmployeeWage employeeWage = new EmployeeWage();

        if ((isPresent()) > 0) calculateWage();
        else System.out.println("Employee is absent");

        System.out.println("Total Wage of Employee is : " + employeeWage.wage);
    }

    static void calculateWage() {
        wage = emphours * RATE_PER_HOUR;
    }

}
