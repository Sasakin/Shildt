
// Обработать исключение и продолжить работу
import java.util.Random;

class HandleError {
	public static void main(String args[]) {
		int a=0, b=0, c=0
		Random r = new Random();

		for( int i=0; i<32000; i++){
			try { // проконтролировать блок кода
				b=r.nextInt();
				c=r.nextInt();
				a=12345/(b/c);	
			}
			catch (ArithmeticException e) { // перехватить ошибку деления на нуль
				System.out.println("деление на нуль");
				a=0; // присвоить нуль и продолжить работу
			}
		System.out.println("a:"+a);
	}
	}
}