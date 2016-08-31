// эта программа содержит ошибку, поэтому она не подлежит компиляции
class ThrowsDemo {
	static void throwOne() {
		System.out.println("В теле метода throwOne()")
		throw new IllegalAccessException("демонстрация");
	}
		
	public static void main(String args[]) {
		throwOne();
	}
}