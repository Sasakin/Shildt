// Применение оператора break для выхода из цикла
class BreakLoop {
	public static void main(String args[]) {
		for(int i=0; i<10; i++) {
			for(j=i;j<100;j++){
				if(i==10) break;  // выходим из цикла, если значение 
								  // переменной i равно 10
				System.out.print("i: "+i);
			}
			System.out.println("Цикл завершен");
		}
	}
}