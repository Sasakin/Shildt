// Пример вложенного интерфейса

// этот класс содержит интерфейс как свой член
class A {
	// это вложенный интерфейс
	public interface NastedIf {
		boolean isNotNegative(int x);
	}
}
// класс B реалезует вложенный интерфейс
class B implements A.NastedIf {
	public boolean isNotNegative(int x) {
		return x<0 ? false:true;
	}
}
class NestedIfDemo {
	public static void main(String args[]) {
		// использовать ссылку на вложенный интерфейс
		A.NastedIf nif = new B();

		if(nif.isNotNegative(10))
			System.out.println("число 10 неотрицательное");
		if(nif.isNotNegative(-12))
			System.out.println("это не будет выведено")
	}
}