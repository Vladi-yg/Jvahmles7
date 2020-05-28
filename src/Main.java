public class Main {

    public static void main(String[] args) {
    	init();

    }
    public static void init() {
		Basin basin = new Basin(0, true);
		basin.fillBasin(0, true);
		Cat cat = new Cat(0, 400);
		cat.groupCat(); // для первых четырех номеров просто введу cat.eat


	}
}
