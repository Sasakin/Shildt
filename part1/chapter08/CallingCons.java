// продемонстрировать порядок вызова конструкторов

class A {
	A() {
		System.out.println("В конструкторе A");
	}
}
class B {
	B() {
		System.out.println("В конструкторе B");
	}
}
class C {
	C() {
		System.out.println("В конструкторе C");
	}
}



class CallingCons {
	public static void main(String args[]) {
		C c = new C();
	}
}