import java.lang.Math; 
public class parttimeUC3 {
	public static void main(String[] args){
                int fulltime = 1;
                int absent = 0;
                int parttime = 2;
                int wageperhour=20;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                int emphrs=0;
                int salaryperday=0;

                if (empCheck == fulltime){
                        System.out.println("Full time employee.");
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
                else if (empCheck == parttime ){
                        System.out.println("Parttime employee");
                        emphrs=4;
                        salaryperday = (emphrs*wageperhour);
                        System.out.println(salaryperday);
                }

        }
        
}