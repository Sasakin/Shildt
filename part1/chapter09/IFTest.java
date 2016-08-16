// Реализация интерфейса IntStack для стека фиксированного размера
 class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // выделить память и инициалезировать стек
    FixedStack(int size) {
      stck = new int[size];
      tos = -1;
    }

    // разместить элемент в стэке
    void push(int item) {
      if(tos==stck.length-1) // использовать поле длинны стека
        System.out.println("Стек заполнен.");
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

class IFTest {
  public static void main(String args[]) {
    FixedStack mystack1 = new FixedStack(5);
    FixedStack mystack2 = new FixedStack(8);

    // разместить чила в стеке
    for(int i=0; i<5; i++) mystack1.push(i);
    for(int i=0; i<8; i++) mystack2.push(i);

    // извлеч эти числа из сиека
    System.out.println("Содержимое стека mystack1:");
    for(int i=0;i<5;i++) 
        System.out.println(mystak1.pop());

    System.out.println("Содержимое стека mystack2:");
    for(int i=0;i<8;i++) 
        System.out.println(mystak2.pop());
  }
}
