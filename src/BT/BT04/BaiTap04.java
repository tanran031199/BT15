package BT.BT04;

import java.util.Scanner;

public class BaiTap04 {
    static int num;

    public static void main(String[] args) {
        convertToNumber();
    }

    public static void convertToNumber() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Nhập vào chuỗi muốn chuyển đổi thành số:");
            int input = Integer.parseInt(sc.nextLine());
            System.out.println("number = " + input);
        } catch (NumberFormatException e) {
            System.err.println("Sai định dạng!");
            System.out.println("number = " + num);
        }
    }
}
