/*  
	Эта программа содержит ошибку.
	В последовательности операторов catch
	подкласс исключений
	должен быть указан перед его суперклассом,
	иначе это привдет к 
	недостижимому коду 
	и ошибке во время компиляции
*/

import java.util.Random;

class SuperSubCatch {
	public static void main(String args[]) {
		try { 
			int a = 0 ;
			int b = 42/a;
		}
		catch (Exception e) { 
			System.out.println("Перехват исключения общего класса Exception.");
		}
		/* Этот оператор catch вообще не будет достигнут т.к.
		   подклас ArithmeticException является производным 
		   от класса Exception */

		catch (ArithmeticException e) { // ОШИБКА: недостижимый код!
			System.out.println("Этот код вообще не достижим." );
		}
	}
}