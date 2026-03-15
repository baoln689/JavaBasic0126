package JavaBasic3;

public class CauLenhIFELSE {
    int number = 100;
    public void SoSanh(int n) {
        if(n == number) {
            System.out.println("Kết quả: " + n + " = 100");
        }
        else if(n < number) {
            System.out.println("Kết quả: " + n + " < 100");
        } else{
            System.out.println("Kết quả: " + n + " < 100");
        }
    }

    public static void main(String[] args) {
        CauLenhIFELSE check = new CauLenhIFELSE();
        check.SoSanh(50);
    }
}
