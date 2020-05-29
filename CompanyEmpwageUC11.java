public class CompanyEmpwageUC11{
	final String company_name;
    final int emp_rate_per_hour;
	final int working_days;
	final int max_hours_per_month;
	private int totalEmpwge;

	public CompanyEmpwageUC11(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		this.company_name = company_name;
		this.emp_rate_per_hour = emp_rate_per_hour;
		this.working_days = working_days;
		this.max_hours_per_month = max_hours_per_month;
	}
	public void settotalEmpwage(int totalEmpwge){
		this.totalEmpwge=totalEmpwge;
	}
	@Override
	public String toString(){
		return "Total Empwage for company " +company_name+":"+totalEmpwge;
	}
}