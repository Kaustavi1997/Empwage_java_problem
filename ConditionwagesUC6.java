import java.lang.Math; 
public class ConditionwagesUC6 {
	public static void main(String[] args){
		int fulltime = 1;
                int parttime = 0;
		int wageperhour=20;
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		int emphrs=0;
		int salarypermonth=0;
                int totalworkingdays=20;
                int a ,i ;
                int hours=0;


	if (empCheck == fulltime)
        	System.out.println("Fulltime Employee");
        if (empCheck == parttime)
        	System.out.println("Part time Employee");

        switch (empCheck) {
        	case 0:
        		// System.out.println("Fulltime Employee");
        		emphrs=4;
        		break;
                case 1:
                        // System.out.println("Part time Employee");
                        emphrs=8;
                        break;
        	default:
        		System.out.println("Invalid");
        		break;


        }

        for (i=1;i<=20;i++)
        {
                a = (int) Math.floor(Math.random() * 10) % 2;
                if (a == 0)
                        System.out.println("Absent");
                if (a == 1)
                        System.out.println("Present");
                hours = (hours+(a*emphrs));
                System.out.println("Per-day_hours="+a*emphrs);
                System.out.println("Total_hours="+hours);
        }

        if (hours>=100)
        {
             salarypermonth=(hours * wageperhour);
             System.out.println(salarypermonth);  
        }
        else{
               System.out.println("less than 100 hrs"); 
        }
	}
}