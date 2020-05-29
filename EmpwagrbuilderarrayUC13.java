import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EmpwagrbuilderarrayUC13 implements ICompanyEmpwageUC11 {
	public static final int Part_Time = 1;
	public static final int Full_Time = 2;

	List<CompanyEmpwageUC11> companyEmpwageArray = new ArrayList<CompanyEmpwageUC11> ();
	List<Integer> daily_wages = new ArrayList<Integer> ();
	public void addCompanyEmpWage(String company_name,int emp_rate_per_hour,int working_days,int max_hours_per_month){
		CompanyEmpwageUC11 e = new CompanyEmpwageUC11(company_name , emp_rate_per_hour , working_days , max_hours_per_month);
		companyEmpwageArray.add(e);
	}
	public void computeEmpwage(){
		for(int i = 0; i < companyEmpwageArray.size(); i++){
			companyEmpwageArray.get(i).settotalEmpwage(this.computeEmpwage(companyEmpwageArray.get(i)));
			System.out.println(companyEmpwageArray.get(i));
		}
	}

	public void printDailyWage(){
		for(int i=0;i<daily_wages.size();i++){
			System.out.println(daily_wages.get(i));
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
			daily_wages.add(hrs*20);
			System.out.println("Day :" + totalworkingdays + " " + "Emphrs :" + hrs + "Daily wage=" + (hrs*20));
		}
		return totalhrs * companyEmpwageUC11.emp_rate_per_hour;
	}
	public static void main(String[] args){
		EmpwagrbuilderarrayUC13 empwagrbuilder = new EmpwagrbuilderarrayUC13();
		empwagrbuilder.addCompanyEmpWage("DMart",20,22,100);
		empwagrbuilder.addCompanyEmpWage("Sephora",40,26,200);
		empwagrbuilder.computeEmpwage();
		System.out.println("Daily wages:");
		empwagrbuilder.printDailyWage();

	}

}