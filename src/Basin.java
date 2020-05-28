import java.util.Scanner;
public class Basin {
    private int basinValue;
    private final int maxBasinValue = 400;
    private boolean basinValuechek;
    Scanner scanner = new Scanner(System.in);
    public Basin(int basinValue, boolean basinValuechek) {
        this.basinValue = basinValue;
        this.basinValuechek = basinValuechek;
    }

    public void fillBasin (int basinValue, boolean basinValuechek) {
        do {
            System.out.println("В миске сейчас находится: " + basinValue);
            System.out.println("В миске помещается 400 г кошачьего корма, введите число, на которое вы хотите наполнить миску");
            int food = scanner.nextInt();
            basinValue = basinValue + food;
            if (basinValue > maxBasinValue) {
                basinValuechek = false;
                System.out.println("В миску столько не поместится, введите другое значение");
                food = scanner.nextInt();
            } else {
                basinValuechek = true;
                System.out.println("В миске теперь находится " + basinValue + " г");
            }
        } while (basinValuechek != true);
    }
}
