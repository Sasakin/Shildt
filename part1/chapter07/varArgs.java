// Продемонстрировать применение аргументов переменной длинны
class varArgs {
	// теперь метод vaTest() объявляется с аргументами переменной длины
	static void vaTest( int ... v) {
		System.out.println("Колличество аргументов: " + v.length + "Содержимое: ");
		for(int x:v) 
		 System.out.println(x +" ")	
		System.out.println();
	}
	public static void main(String args[]) {
		// обратите внимание на возможные способы вызова
		// метода vaTest() с аргументами переменной длины
		vaTest(10); // 1 аргумент
		vaTest(1,2,3); // 3 аргумента
		vaTest(); // без аргументов
    }
}