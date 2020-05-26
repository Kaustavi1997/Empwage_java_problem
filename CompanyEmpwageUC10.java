public class CompanyEmpwageUC10{
	private final String company_name;
	private final int emp_rate_per_hour;
	private final int working_days;
	private final int max_hours_per_month;
	private int totalEmpwge;

	public CompanyEmpwageUC10(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		this.company_name = company_name;
		this.emp_rate_per_hour = emp_rate_per_hour;
		this.working_days = working_days;
		this.max_hours_per_month = max_hours_per_month;
	}
	public void settotalEmpwage(int totalEmpwge){
		this.totalEmpwage=totalEmpwage;
	}
	public String toString(){
		return "Total Empwage for company " +company_name+":"+totalEmpwge;
	}
}