/* В иерархии классов закрытые члены остаются закрытыми 
   В пределах своего класса.

   Эта программа содержит ошибку, и поэтому
   скомпилировать ее не удастся.
 */

class A {
	int i;			// этот член открыт
	private int j;  // а этот член закрыт в классе A

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

// член j класса A в этом классе недоступен 
class B extends A {
	int total;
	void sum() {
		total = i+j; // ОШИБКА , член j в этом классе недоступен
	}
}
class Access {
	public static void main(String args[]) {
		B subOb = new B();
		subOb.setij(10,12);
		subOb.sum();
		System.out.println("Сумма равна "+subOb.total );
    }
}