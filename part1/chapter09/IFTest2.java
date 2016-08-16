// Реализация наращиваемого стека
 class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // выделить память и инициалезировать стек
    DynStack(int size) {
      stck = new int[size];
      tos = -1;
    }

    // разместить элемент в стэке
    void push(int item) {
      // если стек заполнен выделить память под стек большего размера
      if(tos==stck.length-1) // использовать поле длинны стека
        int temp[]= new int[stck.length*2]; // удвоить размер стека
        for(int i = 0; i< stck.length;i++) temp[i]=stck[i];
        stck=temp;
        stck[++tos]=item;
      else
        stck[++tos]=item;
    }
    // извлеч элемент из стека
    int pop() {
      if (tos<0){
        System.out.println("Стек не загружен.");
        return 0;
      }
      else 
        return stck[tos--];
    }
}

class IFTest2 {
  public static void main(String args[]) {
    DynStack mystack1 = new DynStack(5);
    DynStack mystack2 = new DynStack(8);

    // в этих циклах увеличивается размер каждого стека
    for(int i=0; i<12; i++) mystack1.push(i);
    for(int i=0; i<20; i++) mystack2.push(i);

    // извлеч эти числа из сиека
    System.out.println("Содержимое стека mystack1:");
    for(int i=0;i<12;i++) 
        System.out.println(mystak1.pop());

    System.out.println("Содержимое стека mystack2:");
    for(int i=0;i<20;i++) 
        System.out.println(mystak2.pop());
  }
}
