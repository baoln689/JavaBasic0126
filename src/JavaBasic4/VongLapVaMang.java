package JavaBasic4;

public class VongLapVaMang {
    public static void main(String[] args) {
//        int evenNumbers[] = new int[26];  //khai báo mảng số chẵn, từ 0-50 có 26 số chẵn
//        int index = 0;   //biến đếm để lưu vị trí của mỗi số chẵn trong mảng
//        for (int i = 0; i <= 50; i+=2) {
//            evenNumbers[index] = i;
//            index++;
//        }
//
//        for (int number : evenNumbers) {   //FOR cải tiến duyệt qua tất cả phần tử của mảng
//            System.out.print(number + " ");
//        }

        int maxNumber = 50;
        int count = 0;

        System.out.println("Số chẵn là: ");
        for (int i = 0; i <= maxNumber; i++) {
            if (i % 2 == 0)
            {   //kiểm tra nếu i là số chẵn
                System.out.print(i + " ");
                count++;  //đếm số phần tử là số chẵn để xác định kích thước của mảng
            }
        }

        int MangSoChan[] = new int[count];
        int index = 0;

        for (int i = 0; i <= maxNumber; i++)
        {
            if (i % 2 == 0) {
                MangSoChan[index] = i;   //lưu số chẵn vào mảng
                index++;
            }
        }

        System.out.println("Mảng số chẵn là: ");
        for (int i = 0; i < MangSoChan.length; i++) {
            System.out.print(MangSoChan[i] + " ");
        }
    }
}
