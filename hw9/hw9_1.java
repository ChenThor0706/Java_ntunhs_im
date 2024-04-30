package hw9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class hw9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // 輸入不定量的內容，以 -1 結束
        System.out.println("請輸入數字，以-1結束：");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            numbers.add(input);
        }

        // 將數字進行排序
        Collections.sort(numbers);

        // 計算最大值、最小值和平均值
        int minValue = numbers.get(0);
        int maxValue = numbers.get(numbers.size() - 1);
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double averageValue = sum / numbers.size();

        // 輸出結果
        System.out.println("排序後的數字：" + numbers);
        System.out.println("最小值：" + minValue);
        System.out.println("最大值：" + maxValue);
        System.out.println("平均值：" + averageValue);
	}

}
