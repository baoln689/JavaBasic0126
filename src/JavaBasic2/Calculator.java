package JavaBasic2;

public class Calculator {
//    int number1, number2;
//    float a,b;

    public int TongSoNguyen(int number1, int number2) {
        return number1 + number2;
    }

    public float TichSoThuc(float a, float b) {
        return a * b;
    }

//    public void TinhTongSoNguyen() {
//        int tong = number1 + number2;
//        System.out.println("Tổng = " + tong);
//    }
//
//    public void TinhTichSoThuc() {
//        float tich = a * b;
//        System.out.println("Tích = " + tich);
//    }

    public static void main (String[] args) {
        Calculator cal = new Calculator();
//        cal.number1 = 10;
//        cal.number2 = 20;
        System.out.println("Tổng hai số nguyên = " + cal.TongSoNguyen(10, 20));
        System.out.println("Tích hai số thực = " + cal.TichSoThuc(2.5f, 4.6f));
    }
}
