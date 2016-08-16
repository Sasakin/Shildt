import MyPack.*;


class TestBalance {
	public static void main(String args[]) {
		/* класс Balance объявлен как public, поэтому им можно 
		воспользоваться и вызвать его конструктор */
		Balance test = new Balance("Jaspers",99.88);

		test.show(); // можно также вызвать метод show()
	}
}