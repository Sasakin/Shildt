// Применить метод join(), чтобы ожидать завершения потоков исполнения

class NewThread implements Runnable {

	String name; // имя потока исполнения

	Thread t;

	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this,name);
		// создать новый поток исполнения
		System.out.println("Новый поток "+ t);
		t.start(); // запустить поток на исполнения
	}

	// точка входа в поток исполния
	public void run() {
		try {
			for( int i=5; i>0; i--) {
				System.out.println( name+": "+ i);
				Thread.sleep(1000);
			} 
		} catch(InterruptedException e) {
			System.out.println(name+" прерван");
		}
		System.out.println(name+" завершен");
	}
}

class DemoJoin {
	public static void main(String args[]) {

		NewThread ob1 = new NewThread("Один"); // запустить поток на исполнения
		NewThread ob2 =new NewThread("Два");
		NewThread ob3 =new NewThread("Три");

		System.out.println("поток один запущен: "+ ob1.t.isAlive());
		System.out.println("поток два запущен: "+ ob2.t.isAlive());
		System.out.println("поток три запущен: "+ ob3.t.isAlive());


		try{
			System.out.println("ожидание завершения потоков");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			} catch(InterruptedException e) {
				System.out.println("главный поток исполнения прерван");
			}

			System.out.println("поток один запущен: "+ ob1.t.isAlive());
		System.out.println("поток два запущен: "+ ob2.t.isAlive());
		System.out.println("поток три запущен: "+ ob3.t.isAlive());
		
		System.out.println("главный поток завершен");
		}
	}