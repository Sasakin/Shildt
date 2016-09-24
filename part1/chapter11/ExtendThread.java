// создать второй поток исполнения, расширив класс Thread

class NewThread extends Thread {

	NewThread() {
		// создать новый поток исполнения
		super("Демонстрационный поток");
		System.out.println("Дочерний поток "+ this);
		start(); // запустить поток на исполнения
	}

	// точка входа во второй поток исполния
	public void run() {
		try {
			for( int i=5; i>0; i--) {
				System.out.println("Дочерний поток "+ i);
				Thread.sleep(500);
			} 
		} catch(InterruptedException e) {
			System.out.println("Дочерний поток прерван");
		}
		System.out.println("Дочерний поток завершен");
	}
}

class ExtendThread {
	public static void main(String args[]) {
		new NewThread(); // создать новый поток исполнения


		try{
			for(int i=5; i>0; i--) {
				System.out.println("главный поток " + i);
				Thread.sleep(1000);
			}
			} catch(InterruptedException e) {
				System.out.println("главный поток исполнения прерван");
			}
		System.out.println("главный поток завершен");
		}
	}