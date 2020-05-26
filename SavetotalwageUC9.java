public class SavetotalwageUC9{
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	private final String company_name;
	private final int emp_rate_per_hour;
	private final int working_days;
	private final int max_hours_per_month;
	private int totalEmpwge;

	public SavetotalwageUC9(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		this.company_name = company_name;
		this.emp_rate_per_hour = emp_rate_per_hour;
		this.working_days = working_days;
		this.max_hours_per_month = max_hours_per_month;

	}
	private int calculateTotalEmpwage(){
		int hrs=0 , totalhrs=0, totalworkingdays=0;
		while(totalhrs<=max_hours_per_month && totalworkingdays<working_days){
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
		totalEmpwge= totalhrs * emp_rate_per_hour;
		return totalEmpwge;
	}
	public String toString(){
		return "Total Empwage for company " +company_name+":"+totalEmpwge;
	}
	public static void main(String[] args) {
		
		SavetotalwageUC9 dmart = new SavetotalwageUC9("Dmart" , 100 , 20 , 100);
		SavetotalwageUC9 sephora = new SavetotalwageUC9("Sephora" , 200 , 24 , 100);
		dmart.calculateTotalEmpwage();
		System.out.println(dmart);
		sephora.calculateTotalEmpwage();
		System.out.println(sephora);
	}

} 