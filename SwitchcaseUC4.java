import java.lang.Math; 
public class SwitchcaseUC4 {
	public static void main(String[] args){
		int fulltime = 1;
		int absent = 0;
                int parttime = 2;
		int wageperhour=20;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		int emphrs=0;
		int salaryperday=0;

	if (empCheck == fulltime)
        	System.out.println("Fulltime Employee");
        if (empCheck == parttime)
        	System.out.println("Part time Employee");
        if (empCheck == absent)
                System.out.println("Employee is absent.");
        switch (empCheck) {
        	case 0:
        		System.out.println("Employee is Absent");
        		emphrs=0;
        		salaryperday = (emphrs*wageperhour);
        		break;
        	case 1:
        		System.out.println("Fulltime Employee");
        		emphrs=8;
        		salaryperday = (emphrs*wageperhour);
        		break;
                case 2:
                        System.out.println("Part time Employee");
                        emphrs=4;
                        salaryperday = (emphrs*wageperhour);
                        break;
        	default:
        		System.out.println("Invalid");
        		break;


        }

        System.out.println(salaryperday);
	}
}