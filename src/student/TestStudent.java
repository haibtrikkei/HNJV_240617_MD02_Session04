package student;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        StudentRikkei[] list;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số sinh viên: ");
        n = Integer.parseInt(scanner.nextLine());

        list = new StudentRikkei[n];
        for (int i = 0; i<n;i++){
            System.out.println("Nhập thông tin sinh viên thứ "+(i+1));
            StudentRikkei sr = new StudentRikkei();
            sr.input(scanner);
            list[i] = sr;
        }
        System.out.println("Thông tin các sinh viên: ");
        for(StudentRikkei sr: list){
            sr.display();
        }
        list[0].endTable();
    }
}
