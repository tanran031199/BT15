package BT.BT02;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap02 {
    public static void main(String[] args) {
        findMax();
    }

    public static void findMax() {
        Scanner sc = new Scanner(System.in);
        int[] arr;

        try {
            System.out.println("Nhập vào số phần tử của mảng:");
            int n = Integer.parseInt(sc.nextLine());
            arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = (int) Math.floor((Math.random() * 1000) + 1);
            }

            int max = arr[0];

            for (int i = 0; i < n; i++) {
                if(max < arr[i]) {
                    max = arr[i];
                }
            }

            System.out.println();
            System.out.println(Arrays.toString(arr));
            System.out.println("Số lớn nhất trong mảng là: " + max);
        } catch (NumberFormatException e) {
            System.err.println("Nhập vào sai định dạng!");
            findMax();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Mảng không có phần tử nào!");
            findMax();
        }
    }
}
