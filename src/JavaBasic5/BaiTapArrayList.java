package JavaBasic5;

import java.util.ArrayList;

public class BaiTapArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxNumber = 50;

        for (int i = 0; i <= maxNumber; i++) {
            if (i % 2 == 0) {
                list.add(i);   //thêm số chẵn vào ArrayList
            }
        }

        System.out.println("Số chẵn là: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }


    }



}
