package math;
import java.util.Scanner;
import java.lang.Math;

public class math {
	static double fv;
	static final double interest=0.05;

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);	
		int pv=0;
		int interval = 0;

		System.out.print("Enter pv¡G");
		pv=sc.nextInt();
	System.out.print("Enter interval¡G");
	interval=sc.nextInt();
		fv = pv*Math.pow((1+interest),interval);
	System.out.println("My pv is "+pv +" and after "+interval +"year it would be " +fv );
	
	}

}
