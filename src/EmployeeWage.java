public class EmployeeWage {
    static int status;
    static int RATE_PER_HOUR;
    static int wage = 0;
    final static int PART_TIME = 0;
    final static int FULL_TIME = 1;
    static int WORKING_DAYS_IN_MONTH;
    static int WORKING_HOURS_IN_MONTH;
    static int emphours;
    static int halfDayWorking = 0;
    static int fullDayWorking = 0;
    static int maxHours=100;

    EmployeeWage() {
        RATE_PER_HOUR = 20;
        WORKING_DAYS_IN_MONTH = 20;
    }

    static int isPresent() {
        status = (int) (Math.random() * 10) % 3;
        switch (status) {
            case FULL_TIME:
                emphours = 8;
                WORKING_HOURS_IN_MONTH+=8;
                fullDayWorking++;
                break;
            case PART_TIME:
                emphours = 4;
                WORKING_HOURS_IN_MONTH+=4;
                halfDayWorking++;
                break;
            default:
                emphours = 0;
        }
        return emphours;
    }

    public static void main(String[] args) {

        EmployeeWage employeeWage = new EmployeeWage();
        int totalMonthtlyWage = 0;
        int day = 0;
        while (day < WORKING_DAYS_IN_MONTH && WORKING_HOURS_IN_MONTH<maxHours) {
            if ((isPresent()) > 0) {
                totalMonthtlyWage += calculateWage();
                day++;
            }
        }
        System.out.println("Total Full Working Days : " + fullDayWorking);
        System.out.println("Total Half Working Days : " + halfDayWorking);
        System.out.println("Total Working day : " + day);
        System.out.println("Total Working Hours : " + WORKING_HOURS_IN_MONTH);
        System.out.println("Total Wage of Employee is : " + totalMonthtlyWage);
    }

    static int calculateWage() {
        return (emphours * RATE_PER_HOUR);
    }

}
