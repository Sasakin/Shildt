// Использовать аргументы переменной длинны вместе со стандартными аргументами
class varArgs2 {
	// теперь метод vaTest() объявляется с аргументами переменной длины
	static void vaTest(String msg, int ... v) {

		// в данном примере msg - обычный параметр
		// а  v параметр переменной длинны
		System.out.println(msg + v.length + "Содержимое: ");
		for(int x:v) 
		 System.out.println(x +" ")	
		System.out.println();
	}
	public static void main(String args[]) {
		vaTest("один параметр переменной длины"10); 
		vaTest("два параметра переменной длины ",1,2,3); 
		vaTest("без параметров  переменной длины"); 
    }
}