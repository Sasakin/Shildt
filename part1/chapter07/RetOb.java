// Возврат объекта
 class Test {
  int a;
  Test(int i) {
    a=i;
  }
  Test incrByTen() {
    Test temp = new Test(a+10);
    return temp;
  }

  // передать объект
  	void meth(Test o) { 
      o.a *=2;
      o.b /=2;
  	}
  }

class RetOb {
	public static void main(String args[]) {
		Test ob1 = new Test(2);
    Test ob2;

    ob2=ob1.incrByTen();

    System.out.println("ob1.a: "+ ob1.a );
    System.out.println("ob2.a: "+ ob2.a);

    ob2=ob2.incrByTen();
    System.out.println("ob2.a после второго увеличения значения: "+  ob2.a );
	}
}