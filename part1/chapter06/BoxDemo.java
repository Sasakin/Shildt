/* Программа использующая класс Box

  Присвоить исходному файлу имя BoxDemo.java
 */
  class Box {
  	double whidth;
  	double height;
  	double depth;
  }

// В этом классе объявляется объект типа Box
class BoxDemo {
	public static void main(String args[]) {
		Box mybox = new Box();
		double vol;
				// присвоить значения переменным экземпляра mybox
		mybox.whidth=10;
		mybox.height=20;
		mybox.depth=15;

		// расчитать объем параллелепипеда
		vol = mybox.whidth*mybox.height*mybox.depth;
		System.out.println("Объем равен " + vol);	
	}
}