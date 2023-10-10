package BT.BT01;

import java.util.Scanner;

public class BaiTap01 {
    public static void main(String[] args) {
        sum();
    }

    private static void sum() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vào số a:");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số b:");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Tổng của a và b là: " + (a + b));
        } catch (NumberFormatException e) {
            System.err.println("Kiểu dữ liệu nhập vào không phải số nguyên!");
            sum();
        }
    }
}
