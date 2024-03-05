package hw2;
import java.util.Scanner;
public class hw2_1 {
	static String fever;
	static String cough;
	static String lazy;
	static String highbool;
	static String dry;
	static String sweats;
	public static void main(String[] args) {

	
	Scanner sc = new Scanner (System.in);
	System.out.print("請問你最近是否發燒(y/n)");
	fever = sc.next();
	if(fever.toLowerCase().equals("y")) {
		System.out.print("請問你有咳嗽嗎(y/n)");
		cough = sc.next();
		
		if(cough.toLowerCase().equals("y")) {
			System.out.print("請問你有疲倦嗎(y/n)");
			lazy =sc.next();
			if(cough.toLowerCase().equals("y")) {
				System.out.print("你可能得了感冒！");
			}
			else {
				System.out.print("你可能得了其他系統！");
			}
		}
		else {
			System.out.print("請問你有高血壓嗎(y/n)");
			highbool = sc.next();
			if(highbool.toLowerCase().equals("y")) {
				System.out.print("請問你有口乾嗎(y/n)");
				dry = sc.next();
				if(dry.toLowerCase().equals("y")) {
					System.out.print("你可能得了肝病！");
				}
				else {
					System.out.print("你可能得了其他系統！");
				}
				
			}
			else {
				System.out.print("請問你有盜汗嗎(y/n)");
				sweats = sc.next();
				if(sweats.toLowerCase().equals("y")) {
					System.out.print("你可能得了肺病！");
				}
				else {
					System.out.print("你可能得了其他系統！");
				}
			}
		}
	}
	else {
		System.out.print("你很正常");
	}












}
}

