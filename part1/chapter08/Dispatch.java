class A {
	void callme() {
		System.out.println("В методе callme() из класса А");
	}
}

// создать подкласс путем расширения класса A
class B extends A {
	void callme() {
		System.out.println("В методе callme() из класса B");
	}
}
class C extends A {
	void callme() {
		System.out.println("В методе callme() из класса C");
	}
}

class Dispatch {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();

		A r; // cылка на объект класса А

		r = a;
		r.callme(); //callme() из А

		r = b;
		r.callme();  //callme() из B

		r=c;
		r.callme();  //callme() из C
    }
}