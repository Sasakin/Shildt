// использовать super , чтобы предотвратить сокрытие имен
class A {
	int i;			// этот член открыт
}

// создать подкласс
class B extends A {
	int i;    // этот член i скрывает i из класса А
	B(int a, int b) {
		super.i=a;  // i из А
		i=b;		// i из B
	}
	void show() {
		System.out.println("член i в суперклассе:"+ super.i);
		System.out.println("член i в подклассе:"+ i);
	}
}
class UseSuper {
	public static void main(String args[]) {
		B subOb = new B(1,2);
		
		subOb.show();
    }
}