// Использовать метод по умолчанию
class DefaultMethodDemo {
	public static void main(String args[]) {
		MyIfImp obg = new MyIfImp();
		// метод getNumber() можно вызвать
		// так как он явно реалезован в классе MyIfImp
		System.out.println(obj.getNumber());
		// метод getString() так же можно вызвать так как в интерфейсе 
		// MyIf есть его реализация по умолчанию
		System.out.println(obj.getString());
	}
}