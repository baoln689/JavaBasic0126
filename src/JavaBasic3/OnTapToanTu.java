package JavaBasic3;

public class OnTapToanTu {
    public static void main(String[] args) {
        int GPA = 4;
        boolean hasThesis = true;

        if (GPA > 3.5 && hasThesis) {
            System.out.println("Được học bổng 100%");
        } else if (GPA <= 3.5 && hasThesis) {
            System.out.println("Được học bổng 50%");
        } else
            System.out.println("Không được học bổng");

        boolean isWeekend = true;
        boolean isHoliday = false;

        if (isWeekend || isHoliday) {
            System.out.println("Được nghỉ làm");
        } else {
            System.out.println("Đi làm");
        }
    }
}


