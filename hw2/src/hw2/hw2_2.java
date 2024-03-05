package hw2;
import java.util.Scanner;

public class hw2_2 {

	public static void main(String[] args) {
		int result = (int)(Math.random()*99+1);
		int playerInput = -1;
		int minNumber = 0, maxNumber = 100;
		
		while(playerInput != result) {
			Scanner keyboardInput = new Scanner(System.in);
			
			do {
				System.out.println("請輸入數字(範圍" + minNumber + "~" + maxNumber + "):");
				playerInput = Integer.parseInt(keyboardInput.nextLine());
			}while((playerInput < minNumber) || (playerInput > maxNumber));
			
			if(playerInput > result) {
				maxNumber = playerInput;
			} else if(playerInput < result) {
				minNumber = playerInput;
			}
			
		}
		
		System.out.println("你猜對了!");	
		
	}

}