// приостановка и возобнавление потока современным способом
class NewThread implements Runnable {
	String name; // имя потока исполнения
	Thread t;
	boolean suspendFlag;

	NewThread(String threadname) {
		name = threadname;
		t = new Thread(this,name);
		System.out.println("Новый поток "+ t);
		suspendFlag = false;
		t.start(); // запустить поток исполнения
	}

	// Точка входа в поток исполнения
	public void run() {
		try {
			for(int i=15; i>0; i-- ) {
				System.out.println(name + ": "+i);
				Thread.sleep(200);
				synchronized(this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		} catch(InterruptedException e) {
			System.out.println(name + "прерван");
		}
		System.out.println(name + " завершен");
	}

	synchronized void mysuspend() {
		suspendFlag = true; 
	}

	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}


class SuspendResume {
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("Один");
		NewThread ob2 = new NewThread("Два");

		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("приостановка потока Один");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("возобновление потока Один");
			ob2.mysuspend();
			System.out.println("приостановка потока Два");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Возобновление потока Два");
		} catch(InterruptedException e) {
			System.out.println("главный поток прерван");
		}

		System.out.println("Главный поток завершен");
	}
}