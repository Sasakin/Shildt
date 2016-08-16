class Client implements Callback {
	// реализовать интерфейс callback
	public void callback(int p) {
		System.out.println("метод callback() вызываемый со значением: "+ p);		
	}
	void nonIfaceMeth() {
		System.out.println("В классах реализующих интерфейсы, могут содержаться и другие члены.");
	}
}