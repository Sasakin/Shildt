// создать второй поток исполнения

class NewThread implements Runnable {
	Thread t;

	NewThread() {
		// создать новый поток исполнения
		t = new Thread(this,"Демонстрационный поток");
		System.out.println("Дочерний поток создан "+ t);
		t.start(); // запустить поток исполнения
	}

	// точка входа во второй поток исполния
	public void run() {
		try {
			for( int i=5; i>0; i--) {
				System.out.println("дочерний поток "+ i);
				Thread.sleep(500);
			} 
		} catch(InterruptedException e) {
			System.out.println("Дочерний поток прерван");
		}
		System.out.println("Дочерний поток завершен");
	}
}

class ThreadDemo {
	public static void main(String args[]) {
		new NewThread(); // создать новый поток


		try{
			for(int n=5; n<0; n--) {
				System.out.println("главный поток " + n);
				Thread.sleep(1000);
			}
			} catch(InterruptedException e) {
				System.out.println("главный поток исполнения прерван");
			}
		System.out.println("главный поток завершен");
		}
	}