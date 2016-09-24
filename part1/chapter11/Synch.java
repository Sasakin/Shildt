// эта программа не синхронезирована

class Callme {
	void call(String msg) {           // synchronized
		System.out.print("["+msg);
		try{
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Прерванно");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable {
	String msg;
	Callme target;
	Thread t;

	public Caller(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() {
		target.call(msg);
	}
}

class Synch {
	public static void main(String args[]) {

		Callme target = new Callme();

		Caller ob1 = new Caller(target,"Добро пожаловать"); // запустить поток на исполнения
		Caller ob2 = new Caller(target,"в синхронизированый");
		Caller ob3 = new Caller(target,"мир!");

		// ожидать завершения потока исполнения

		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			} catch(InterruptedException e) {
				System.out.println("Прервано");
		}
	}
}