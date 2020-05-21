import java.lang.Math; 
public class EmpwageUC1 {
	public static void main(String[] args){
		int present = 1;
		int absent = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == present)
        	System.out.println("Employee is Present.");
        if (empCheck == absent)
        	System.out.println("Employee is Absent.");

	}
}