package hw4;
import java.util.Scanner;
public class hw4_1 {

	public static void main(String[] args) {
		String temp="";
		Scanner sc = new Scanner(System.in);
		System.out.println("這是可以陪你聊程式，問我個問題");
		while(true) {
			System.out.print("你說：");
			temp=sc.nextLine();
			
			if(temp.equals("0")) {
				System.out.println("離開聊天程序");
				break;
				}
			else {
				String originalString = temp;
				String resultString = originalString.replace("嗎","");
				String resultString2 = resultString.replace("會不會","會");
				String resultString3 = resultString2.replace("？","！");
				String resultString4 = resultString3.replace("你會","我會");
				String resultString5 = resultString4.replace("能不能","能");
				String resultString6 = resultString5.replace("你能","我能");
				System.out.println(resultString6);
			}
		}
	
	
	
	}

}