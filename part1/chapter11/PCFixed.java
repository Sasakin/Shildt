// правильная реализация поставщика и потребителя
class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while(!valueSet) 
		try {
			wait();
		} catch(InterruptedException e) {
			System.out.println("исключение типа InterraptedException перехвачено");
		}
		System.out.println("Получено "+n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized void put(int n) {
		while(valueSet) 
		try {
			wait();
		} catch(InterruptedException e) {
			System.out.println("исключение типа InterraptedException перехвачено");
		}
		this.n = n;
		valueSet = true;
		System.out.println("Отправленно "+n);
		notify();
	}
}

class Producer implements Runnable {
	Q q;

	Producer(Q q) {
		this.q=q;
		new Thread(this,"Поставщик").start();
	}

	public void run() {
		int i = 0;

		while(true){
			q.put(i++);
		}
	}
}

class Consurmer implements Runnable {
	Q q;

	Consurmer(Q q) {
		this.q=q;
		new Thread(this,"Потребитель").start();
	}

	public void run() {
		while(true){
			q.get();
		}
	}
}

class PCFixed {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consurmer(q);

		System.out.println("Для остановки нажмите Ctrl-C.");
	}
}