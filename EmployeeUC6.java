public class EmployeeUC6 {
	// Constants
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_A_MONTH = 100;

	public static void main(String[] args) {
		
	// Variables
	int totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;
	// Computation
	while (totalEmpHrs <= MAX_HRS_IN_A_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
		int empHrs = 0, empWage = 0;
		totalWorkingDays++;
		System.out.println(totalWorkingDays);
		int empCheck =(int) Math.floor(Math.random() * 10 ) % 3;
	// Typecasting the output to int as switch case takes only int
		switch (empCheck) {
			case IS_FULL_TIME:
					empHrs = 8;
					break;
			case IS_PART_TIME:
					empHrs = 4;
					break;
			default:
					empHrs = 0;
		}
		totalEmpHrs += empHrs;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage+= empWage;
		System.out.println("Emp Wage: " + empWage);
	}
	System.out.println("Total Emp Wage : " + totalEmpWage);
	}
}
