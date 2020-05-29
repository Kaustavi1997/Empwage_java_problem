public class EmpwagrbuilderarrayUC10{
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	private int numOfCompany = 0;
	private int CompanyEmpwageUC10(); 
	private companyEmpwageArray;

	public Empwagrbuilderarray(){
		companyEmpwageArray = new CompanyEmpwageUC10[5];
	}

	private void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		companyEmpwageArray[numOfCompany] = new CompanyEmpwageUC10(company_name , emp_rate_per_hour , working_days , max_hours_per_month );
		numOfCompany++;
	}
	private void computeEmpwage(){
		for(int i = 0; i < numOfCompany; i++){
			companyEmpwageArray[i].settotalEmpwage(this.computeEmpwage(companyEmpwageArray[i]));
			System.out.println(companyEmpwageArray[i]);
		}
	}
	private int computeEmpwage(CompanyEmpwageUC10 companyEmpwageUC10){
		int hrs=0 , totalhrs=0, totalworkingdays=0;
		while(totalhrs<=companyEmpwageUC10.max_hours_per_month && totalworkingdays<companyEmpwageUC10.working_days){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch(empcheck){
				case Part_Time:
					hrs=4;
					break;
				case Full_Time:
					hrs=8;
					break;
				default:
					hrs=0;
			}
			totalhrs += hrs;
			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs );
		}
		return totalhrs * companyEmpwageUC10.emp_rate_per_hour;
	}
	public static void main(String[] args){
		EmpwagrbuilderarrayUC10 empwagrbuilder = new EmpwagrbuilderarrayUC10();
		empwagrbuilder.addCompanyEmpWage("DMart",20,22,100);
		empwagrbuilder.addCompanyEmpWage("Sephora",40,26,200);
		empwagrbuilder.computeEmpwage();

	}

}
