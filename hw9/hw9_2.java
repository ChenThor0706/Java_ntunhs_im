package hw9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hw9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        Set<String> phoneNumbers = new HashSet<>();

        System.out.println("請輸入手機號碼，以0結束：");
        String input;
        while (!(input = scanner.nextLine()).equals("0")) {
            phoneNumbers.add(input);
        }

        System.out.println("操作者輸入的所有手機號碼數量為：" + phoneNumbers.size());
        System.out.println("所有手機號碼（排除重複）：");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
		
	}

}
