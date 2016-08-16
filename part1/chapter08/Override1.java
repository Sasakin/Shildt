class A {
	int i,j;
	A(int a, int b) {
		i=a;
		j=b;
	}

	void show() {
		System.out.println("i и j:"+ i +" " + j);
	}
}

// создать подкласс путем расширения класса A
class B extends A {
	int k;
	A(int a, int b, int c) {
		super(a,b);
		k=c;
	}
 	// вывести содержимое переменной k
 	// путем переопределения метода show() класа A
	void show(String msg) {
		System.out.println(msg+ k);
	}
	void sum() {
		System.out.println("i+j+k: "+ (i+j+k));
	}
}
class Override1 {
	public static void main(String args[]) {
		B subOb = new B(1,2,3);
		subOb.show("это k"); // здесь вызывается метод из класса B()
		subOb.show(); // здесь вызывается метод из класса A()
    }
}