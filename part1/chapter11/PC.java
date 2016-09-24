// Неправильная реализация поставщика и потребителя
class Q {
	int n;

	synchronized int get() {
		System.out.println("Получено "+n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("Отправленно "+n);
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

class PC {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consurmer(q);

		System.out.println("Для остановки нажмите Ctrl-C.");
	}
}