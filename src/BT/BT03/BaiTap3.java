package BT.BT03;

import java.util.ArrayList;
import java.util.List;

public class BaiTap3 {
    public static void main(String[] args) {
        checkDataType();
    }
    public static void checkDataType() {
        List arr = new ArrayList();

        for (int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                char a = (char) ((int) Math.floor((Math.random() * 100) + 1));
                arr.add(a);
            } else {
                int num = (int) Math.floor((Math.random() * 100) + 1);
                arr.add(num);
            }
        }

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            try {
                sum = sum + (int) arr.get(i);
            }catch (ClassCastException e) {
                System.err.println("Phần tử không phải là số nguyên!");
            }
        }

        System.out.println(arr);
        System.out.println(sum);
    }
}
