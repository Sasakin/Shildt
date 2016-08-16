// В этой программе применяется метод с параметрами
 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// расчитать и возвратить объем
  	void volume() {
  		return whidth*height*depth;
  	}
  	// установить размеры параллелепипеда
  	void setDim(double w, double h, double d){
  		whidth=w;
  		height=h;
  		depth=d;
  	}
  }

// В этом классе объявляется объект типа Box
class BoxDemo5 {
	public static void main(String args[]) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

				// инициализировать каждый элемент класса Box
		mybox1=setDim(10,20,15);
		mybox2=setDim(3,6,9);

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume;	
		System.out.println("Объем равен "+ vol);

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume;	
		System.out.println("Объем равен "+ vol);
	}
}