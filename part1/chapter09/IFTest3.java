// создать переменную интерфейса и обратиться к стекам через нее
class IFTest3 {
  public static void main(String args[]) {
    IntStack mystack;
    DynStack ds = new DynStack(5);
    FixedStack fs = new FixedStack(8);

    mystack = ds; // загрузить динамический стек
    for(int i=0; i<12; i++) mystack1.push(i);
   
    mystack = fs; // загрузить фиксированный стек
    for(int i=0; i<20; i++) mystack2.push(i);

    mystack = ds;
    System.out.println("значения в динамическом стеке:");
    for(int i=0;i<12;i++) 
        System.out.println(mystak1.pop());

    mystack = fs;
    System.out.println("значения в фиксированном стеке:");
    for(int i=0;i<8;i++) 
        System.out.println(mystak2.pop());
  }
}
