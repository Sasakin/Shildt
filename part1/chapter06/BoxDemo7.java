/* В данном примере программы для инициализации размеров
	прарллелепипеда в классе Box применяется параметризованный конструктор
	*/
 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// Это конструктор класса Box
  	Box(double w,double h,double d) {
  		whidth=w;
  		height=h;
  		depth=d;
  	}
  	
  	// рассчитать и возвратить объем
  	double volume(){
  		return whidth*height*depth;
  	}
  }

// В этом классе объявляется объект типа Box
class BoxDemo7 {
	public static void main(String args[]) {
		// объявить, выделить память и инициализировать объекты типа Box
		Box mybox1 = new Box(10,20,15);
		Box mybox2 = new Box(3,6,9);

		double vol;

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume;	
		System.out.println("Объем равен "+ vol);

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume;	
		System.out.println("Объем равен "+ vol);
	}
}