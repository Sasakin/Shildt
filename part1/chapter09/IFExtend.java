// Один интерфейс может расширять другой
interface A {
	void meth1();
	void meth2();
}
// теперь интерфейс B включает ч себя методы meth1(), meth2()
// и добавляет метод meth3();
interface B extends A {
	void meth3();
}
// Этот класс должен реалезовать все методы из интерфейса A и B
class MyClass implements B {
	public void meth1() {
		System.out.println("Реалезация методв meth1()");
	}
	public void meth2() {
		System.out.println("Реалезация методв meth2()");
	}
	public void meth3() {
		System.out.println("Реалезация методв meth3()");
	}
}
class IFExtend {
	public static void main(String args[]) {
		MyClass ob = new MyClass();

		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}