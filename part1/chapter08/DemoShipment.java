// расширение класса BoxWeight

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
  // добавить поле стоимости доставки
  class Shipment extends BoxWeight {
    double cost;
     // сконструировать клон объекта
    Shipment(BoxWeight ob) {
      super(ob);
      cost=ob.cost;
    }

    // конструктор BoxWeight
    Shipment(double w,double h,double d, double m,double c) {
      super(w,h,d,m);
      cost=c;
    }
    // конструктор по умолчанию
    Shipment() {
      super();
      cost=-1;
    }
    // конструктор куба
    Shipment(double len, double m,double c) {
      super(len,m);
      cost=c;
    }
  }
class DemoShipment {
	public static void main(String args[]) {
		Shipment shipment1 = new Shipment(10,20,15,10,3.41);
		Shipment shipment2 = new Shipment(2,3,4,0.76,1.28);
		double vol;

		
		vol = shipment1.volume();	
		System.out.println("Объем  shipment1 равен "+ vol);
		System.out.println("Вес  shipment1 равен "+ shipment1.weight);
    System.out.println("Стоимость доставки  shipment1 равена: "+ shipment1.cost);
		System.out.println();

	
		vol = shipment2.volume(); 
    System.out.println("Объем  shipment2 равен "+ vol);
    System.out.println("Вес  shipment2 равен "+ shipment2.weight);
    System.out.println("Стоимость доставки  shipment1 равена: "+ shipment2.cost);
    System.out.println();

	}
}