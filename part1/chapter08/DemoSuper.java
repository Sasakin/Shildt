// Полная реалезация класса BoxWeight

 class Box {
  	double whidth;
  	double height;
  	double depth;
  	// Сконструировать клон объекта
    Box(Box ob) {
      whidth=ob.whidth;
      height=ob.height;
      depth=ob.depth;
    }
    // Это конструктор используемый при указании всех размеров
  	Box(double w,double h,double d) {
  		whidth=w;
  		height=h;
  		depth=d;
  	}
    // Это конструктор используется когда ни один из размеров не указан
    Box() {
      whidth=-1;
      height=-1;
      depth=-1;
    }
    // Это конструктор используемый при создании куба
    Box(double len) {
       whidth=height=depth=len;
    }
  	
  	// рассчитать и возвратить объем
  	double volume(){
  		return whidth*height*depth;
  	}
  }

// теперь в классе BoxWeight полностью реалезованы все конструкторы
  class BoxWeight extends Box {
  	double weight; // вес параллелепипеда
    // сконструировать клон объекта
    BoxWeight(BoxWeight ob) {
      super(ob);
      weight=ob.weight;
    }

  	// конструктор BoxWeight
  	BoxWeight(double w,double h,double d, double m) {
  		super(w,h,d);
  		weight=m;
  	}
    // конструктор по умолчанию
    BoxWeight() {
      super();
      weight=-1;
    }
    // конструктор куба
    BoxWeight(double len, double m) {
      super(len);
      weight = m;
    }
  }
class DemoSuper {
	public static void main(String args[]) {
		// создать параллелепипеды используя разные конструкторы
		BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
    BoxWeight mybox3 = new BoxWeight();
    BoxWeight mycub = new BoxWeight(3,2);
    BoxWeight myclone = new BoxWeight(mybox1);
		double vol;

		// расчитать объем первого параллелепипеда
		vol = mybox1.volume();	
		System.out.println("Объем mybox1 равен "+ vol);
		System.out.println("Вес mybox1 равен "+ mybox1.weight);
		System.out.println();

		// расчитать объем второго параллелепипеда
		vol = mybox2.volume();	
		System.out.println("Объем mybox2 равен "+ vol);
		System.out.println("Вес mybox2 равен "+ mybox2.weight);
		System.out.println();

    vol = mybox3.volume();  
    System.out.println("Объем mybox3 равен "+ vol);
    System.out.println("Вес mybox3 равен "+ mybox3.weight);
    System.out.println();

    vol = myclone.volume();  
    System.out.println("Объем myclone равен "+ vol);
    System.out.println("Вес myclone равен "+ myclone.weight);
    System.out.println();

    vol = mycub.volume();  
    System.out.println("Объем mycub равен "+ vol);
    System.out.println("Вес mycub равен "+ mycub.weight);
    System.out.println();
	}
}