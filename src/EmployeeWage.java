public class EmployeeWage {
    int status;
    static int RATE_PER_HOUR ;
    static int DAY_HOURS ;
    static int wage=0;
    EmployeeWage() {
        RATE_PER_HOUR=20;
        DAY_HOURS=8;
    }
    boolean isPresent() {
        status=((int)(Math.random()*10)%2);
        if(status==1) {
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {

        EmployeeWage employeeWage=new EmployeeWage();

        if(employeeWage.isPresent()){
            calculateWage();
        }
        System.out.println("Total Wage of Employee is : "+employeeWage.wage);
    }

    static void calculateWage() {
        wage=DAY_HOURS*RATE_PER_HOUR;
    }

}
