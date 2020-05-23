public class RefactorUC7 {
	public static void main(String[] args) {

		EmpwageCalculate obj = new EmpwageCalculate();
		obj.EmpwageCalculate_method();
	}
}
class EmpwageCalculate {
		
		void EmpwageCalculate_method(){
			int empHrs=0, totalEmpHrs=0, totalWorkingDays = 0;
			int IS_PART_TIME = 1;
			int IS_FULL_TIME = 2;
			int EMP_RATE_PER_HOUR = 20;
			int NUM_OF_WORKING_DAYS = 20;
			int MAX_HRS_IN_MONTH = 100;


			while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
				totalWorkingDays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
					case 1:
						empHrs = 4;
						break;
					case 2:
						empHrs = 8;
						break;
					default:
						empHrs = 0;
				}
				totalEmpHrs += empHrs;
				System.out.println("Days:"+totalWorkingDays);
				System.out.println("Emphrs : "+empHrs);

			}
			int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage: " + totalEmpWage);
			
		}	



	}
