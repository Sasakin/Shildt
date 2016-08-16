// аргументы переменной длины, перегрузка и неоднозначность
// эта программа содержит ошибку и не может быть скомпилирована
class varArgs4 {
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
}
	public static void main(String args[]) {
		vaTest(1,2,3); 
		vaTest(true,false,false);
		vaTest();                  //  ошибка, неоднозначность 
    }
}