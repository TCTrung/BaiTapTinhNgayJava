import java.util.Scanner;
import src.TheNextDay;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------");
        System.out.println("Nhap ngay : ");
        int day = scanner.nextInt();
        System.out.println("Nhap thang : ");
        int month = scanner.nextInt();
        System.out.println("Nhap nam : ");
        int year = scanner.nextInt();

        TheNextDay nextDate = new TheNextDay(day,month,year);

        System.out.println("Ngay thang nam tiep theo : ");
        System.out.println(nextDate.getNextDay(day,month,year));
    }
}
