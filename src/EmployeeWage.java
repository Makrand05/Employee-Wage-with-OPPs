public class EmployeeWage {
    static int status;
    static int RATE_PER_HOUR ;
    static int wage=0;
    static int PART_TIME;
    static int FULL_TIME;
    static int emphours;
    EmployeeWage() {
        RATE_PER_HOUR=20;
        PART_TIME=2;
        FULL_TIME=1;
    }
    static int isPresent() {
        status=(int)(Math.random()*10)%3;
        if(status==FULL_TIME)
            emphours=8;
        else if(status==PART_TIME)
            emphours=4;
        else
            emphours=0;
        return emphours;
    }

    public static void main(String[] args) {

        EmployeeWage employeeWage=new EmployeeWage();

        if((isPresent())>0){
            calculateWage();
        }
        else System.out.println("Employee is absent");
        System.out.println("Total Wage of Employee is : "+employeeWage.wage);
    }

    static void calculateWage() {
        wage=emphours*RATE_PER_HOUR;
    }

}
