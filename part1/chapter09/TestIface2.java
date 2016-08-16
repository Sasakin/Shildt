class TestIface2 {
	public static void main(String args[]) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();

		c.callback(42);

		c=ob; // теперь переменная c ссылается на объект типа AnotherClient
		c.callback(42);
	}
}