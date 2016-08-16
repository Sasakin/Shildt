// аргументы переменной длины и перегрузка
class varArgs3 {
	// теперь метод vaTest() объявляется с аргументами переменной длины
	static void vaTest(int ... v) {
		System.out.println("vaTest(int ...):"+ "Количество аргументов" + v.length + "Содержимое: ");
		for(int x:v) 
		 System.out.println(x +" ")	
		System.out.println();
	}
	static void vaTest(boolean ... v) {
		System.out.println("vaTest(boolean ...):"+ "Количество аргументов" + v.length + "Содержимое: ");
		for(boolean x:v) 
		 System.out.println(x +" ")	
		System.out.println();
	}
	static void vaTest(String msg, int ... v) {
		System.out.println("vaTest(String, int ...):"+ msg + v.length + "Содержимое: ");
		for(int x:v) 
		 System.out.println(x +" ")	
		System.out.println();
	}
}
	public static void main(String args[]) {
		vaTest(1,2,3); 
		vaTest("Проверка",10,20); 
		vaTest(true,false,false);
    }
}