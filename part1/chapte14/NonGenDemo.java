package chapte14;

/**
 * Created by sasakin on 17.07.2017.
 */

// Класс NonGen - функциональный эквивалент класса Gen без обобщений.
class NonGen {
    Object ob; // объект ob теперь имеет тип Object

    //Передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // возвратить тип Object
    Object getob() {
        return ob;
    }

    // показать тип объекта ob
    void showType() {
        System.out.println("Объект ob относится к типу " + ob.getClass().getName());
    }
}

//продемонстрировать необобщенный класс
public class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);

        // показать тип данных, хранящийся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getob();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen strOb = new NonGen("Тест без обобщений");

        // показать тип данных, хранящийся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb,
        // на этот раз требуется приведение типов
        String str = (String) strOb.getob();
        System.out.println("Значение: " + str);
        System.out.println();

        //Этот код компилируется, но он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getob(); // Ошибка во время выполнения!
    }

}
