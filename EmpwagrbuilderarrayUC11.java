public class EmpwagrbuilderarrayUC11 implements ICompanyEmpwageUC11 {
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	private int numOfCompany = 0;
	private CompanyEmpwageUC11[] companyEmpwageArray; 

	public EmpwagrbuilderarrayUC11(){
		companyEmpwageArray = new CompanyEmpwageUC11[5];
	}

	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		companyEmpwageArray[numOfCompany] = new CompanyEmpwageUC11(company_name , emp_rate_per_hour , working_days , max_hours_per_month);
		numOfCompany++;
	}
	public void computeEmpwage(){
		for(int i = 0; i < numOfCompany; i++){
			companyEmpwageArray[i].settotalEmpwage(this.computeEmpwage(companyEmpwageArray[i]));
			System.out.println(companyEmpwageArray[i]);
		}
	}
	public int computeEmpwage(CompanyEmpwageUC11 companyEmpwageUC11){
		int hrs=0 , totalhrs=0, totalworkingdays=0;
		while(totalhrs <= companyEmpwageUC11.max_hours_per_month && totalworkingdays < companyEmpwageUC11.working_days){
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
		return totalhrs * companyEmpwageUC11.emp_rate_per_hour;
	}
	public static void main(String[] args){
		EmpwagrbuilderarrayUC11 empwagrbuilder = new EmpwagrbuilderarrayUC11();
		empwagrbuilder.addCompanyEmpWage("DMart",20,22,100);
		empwagrbuilder.addCompanyEmpWage("Sephora",40,26,200);
		empwagrbuilder.computeEmpwage();

	}

}