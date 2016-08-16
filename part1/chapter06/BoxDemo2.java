// В этой программе объявляются два объекта класса Box
  class Box {
  	double whidth;
  	double height;
  	double depth;
  }

// В этом классе объявляется объект типа Box
class BoxDemo2 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

				// присвоить значения переменным экземпляра mybox1
		mybox1.whidth=10;
		mybox1.height=20;
		mybox1.depth=15;
				// присвоить значения переменным экземпляра mybox2
		mybox2.whidth=3;
		mybox2.height=6;
		mybox2.depth=9;

		// расчитать объем первого параллелепипеда
		vol = mybox1.whidth*mybox1.height*mybox1.depth;
		System.out.println("Объем равен " + vol);	

		// расчитать объем второго параллелепипеда
		vol = mybox2.whidth*mybox2.height*mybox2.depth;
		System.out.println("Объем равен " + vol);	
	}
}