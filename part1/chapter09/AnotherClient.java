// еще одна реалезация интерфейса Callback
class AnotherClient implements Callback {
	// реализовать интерфейс callback
	public void callback(int p) {
		System.out.println("Еще один вариани метода callback()");	
		System.out.println("p в квадрате равно " + (p*p));		
	}
}