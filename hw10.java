package hw10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hw10 {
    private static final String FILE_PATH = "C:\\Users\\User\\Desktop\\students.csv"; // 檔案路徑

    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        
        // 檢查並讀取檔案
        File file = new File(FILE_PATH);
        if (file.exists()) {
            // 如果檔案存在，則讀取檔案內容到HashMap中
            loadFromFile(grades, file);
            System.out.println("已從檔案中讀取學生成績。");
        } else {
            // 如果檔案不存在，則建立一個新的檔案
            try {
                file.createNewFile();
                System.out.println("已建立新檔案 " + FILE_PATH);
            } catch (IOException e) {
                System.out.println("建立新檔案時發生錯誤：" + e.getMessage());
            }
        }

        // 主要功能
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("請選擇操作:");
            System.out.println("1.新增學生成績 2.查詢學生成績 3.修改學生成績 4.刪除學生成績 5.列出所有學生成績 6.退出");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 消耗換行符

            switch (choice) {
                case 1:
                    addStudentGrade(grades, scanner);
                    break;
                case 2:
                    queryStudentGrade(grades, scanner);
                    break;
                case 3:
                    updateStudentGrade(grades, scanner);
                    break;
                case 4:
                    removeStudentGrade(grades, scanner);
                    break;
                case 5:
                    listAllStudentGrades(grades);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("請輸入有效的選項！");
            }
        }

        // 程式結束時將HashMap的內容寫入檔案中
        saveToFile(grades, file);
        System.out.println("學生成績已寫入檔案 " + FILE_PATH);
    }

    // 從檔案中讀取學生成績到HashMap中
    private static void loadFromFile(Map<String, Integer> grades, File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int score = Integer.parseInt(parts[1]);
                grades.put(name, score);
            }
        } catch (IOException e) {
            System.out.println("讀取檔案時發生錯誤：" + e.getMessage());
        }
    }

    // 新增學生成績
    private static void addStudentGrade(Map<String, Integer> grades, Scanner scanner) {
        System.out.println("請輸入學生名字:");
        String name = scanner.nextLine();
        System.out.println("請輸入學生成績:");
        int score = scanner.nextInt();
        scanner.nextLine(); // 消耗換行符
        grades.put(name, score);
        System.out.println("學生成績已新增。");
    }

    // 查詢學生成績
    private static void queryStudentGrade(Map<String, Integer> grades, Scanner scanner) {
        System.out.println("請輸入學生名字:");
        String name = scanner.nextLine();
        Integer score = grades.get(name);
        if (score != null) {
            System.out.println(name + "的成績是: " + score);
        } else {
            System.out.println("找不到學生 " + name + " 的成績。");
        }
    }

    // 修改學生成績
    private static void updateStudentGrade(Map<String, Integer> grades, Scanner scanner) {
        System.out.println("請輸入要修改成績的學生名字:");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            System.out.println("請輸入新的成績:");
            int newScore = scanner.nextInt();
            scanner.nextLine(); // 消耗換行符
            grades.put(name, newScore);
            System.out.println(name + "的成績已更新。");
        } else {
            System.out.println("找不到學生 " + name + " 的成績，無法更新。");
        }
    }

    // 刪除學生成績
    private static void removeStudentGrade(Map<String, Integer> grades, Scanner scanner) {
        System.out.println("請輸入要刪除成績的學生名字:");
        String name = scanner.nextLine();
        if (grades.containsKey(name)) {
            grades.remove(name);
            System.out.println(name + "的成績已刪除。");
        } else {
            System.out.println("找不到學生 " + name + " 的成績，無法刪除。");
        }
    }

    // 列出所有學生成績
    private static void listAllStudentGrades(Map<String, Integer> grades) {
        System.out.println("所有學生成績列表:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // 將HashMap的內容寫入檔案中
    private static void saveToFile(Map<String, Integer> grades, File file) {
        try (FileWriter writer = new FileWriter(file)) {
            for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤：" + e.getMessage());
        }
    }
}
