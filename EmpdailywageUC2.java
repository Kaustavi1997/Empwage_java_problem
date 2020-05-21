import java.lang.Math; 
public class EmpdailywageUC2 {
	public static void main(String[] args){
		int present = 1;
		int absent = 0;
		int wageperhour=20;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		int emphrs=0;
		int salaryperday=0;

		if (empCheck == present){
        	System.out.println("Employee is Present.");
        	emphrs=8;
        	salaryperday = (emphrs*wageperhour);
        	System.out.println(salaryperday);
        }
        else if (empCheck == absent){
        	System.out.println("Employee is Absent.");
     		emphrs=0;
        	salaryperday = (emphrs*wageperhour);
        	System.out.println(salaryperday);
        }
	}
	
}
