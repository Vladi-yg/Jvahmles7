import java.util.Scanner;

public class Cat {
    private int hungryLevel = 0;
    private boolean hungrychek;
    private int puttedbasinValue;
    // здесь добавил переменную puttedbasinValue, в класссе Basin была переменая basinValue( при создании объекта Basin basin = new Basin (...) в скобках указываю 0, чтобы миска была вначале пуста.
    // После заполняю ее. Если делаю класс Basin родительским и наследую от него переменную basinValue, то при создании экхемпляра класса Cat cat = new Cat(...) в скобках опять нужно указывать basinValue,
    // как сделать, чтобы после заполнения миски(метод fillBasin в классе Basin) компьютер уже запоминал значение переменной basinValue и при создании объекта Cat не требовал снова записывать значение basinValue?
    //Получается,  что мы должны указывать этот параметр(basinValue) при создании объекта Cat так, как будто мы уже знаем, на сколько мы заполним миску?
    Scanner scanner = new Scanner(System.in);

    public Cat(int hungryLevel, int puttedbasinValue) {
        this.hungryLevel = hungryLevel;
        this.hungrychek = hungrychek;

    }

    public void eat(int hungryLevel, int puttedbasinValue, boolean hungrychek) {
        do {
                System.out.println("Кот очень голоден, введите коли-во еды, которую съест ваш питомец");
            int mountfood = scanner.nextInt();

            if (mountfood < 40) {
                System.out.println("Еды слишком мало, положите больше(введите новое значение)");
                mountfood = scanner.nextInt();
                puttedbasinValue = puttedbasinValue - mountfood;
                System.out.println("После того, как кот поел, в миске осталось " + puttedbasinValue + " г");
            }
            if (mountfood > 40) {
                puttedbasinValue = puttedbasinValue - mountfood;
                System.out.println("Кот сыт");
                System.out.println("После того, как кот поел, в миске осталось " + puttedbasinValue + " г");
                break;
            }
            hungryLevel = hungryLevel + mountfood;
            puttedbasinValue = puttedbasinValue - mountfood;
            if (puttedbasinValue >= 0) {
                System.out.println("После того, как кот поел, в миске осталось " + puttedbasinValue + " г");
                hungrychek = true;
            } else {
                hungrychek = false;
                System.out.println("В миске не достаточно еды, введите другое значение");
                mountfood = scanner.nextInt();
                puttedbasinValue = puttedbasinValue - mountfood;
            }
        } while (hungrychek != true);
    }
    public void groupCat() {
        Cat[] cat = new Cat[5];
        cat[0] = new Cat(0, 400);
        cat[1] = new Cat(0, 400);
        cat[2] = new Cat(0, 400);
        cat[3] = new Cat(0, 400);
        cat[4] = new Cat(0, 400);
        cat[0].eat(0,400, true);
        cat[1].eat(0, 350, true);
        cat[2].eat(0,300, true);
        cat[3].eat(0, 250, true);
        cat[4].eat(0,200, true);
        plusfoodbasin();
        // как вывести информацию с помощью цикла и чтобы автоматически вычиталось из значения puttedbasinValue, вводимое из консоли кол-во еды, которое съест кот?
      //  for (int i = 0; i < 5; i++) {
        //    cat[i].eat(0, 400, true);
       // }
    }
    public void plusfoodbasin() {
        if (puttedbasinValue <= 150) puttedbasinValue = puttedbasinValue + 150;
    }
}