package chapte14;

/**
 * Created by sasakin on 17.07.2017.
 */

// ����� NonGen - �������������� ���������� ������ Gen ��� ���������.
class NonGen {
    Object ob; // ������ ob ������ ����� ��� Object

    //�������� ������������ ������ �� ������ ���� Object
    NonGen(Object o) {
        ob = o;
    }

    // ���������� ��� Object
    Object getob() {
        return ob;
    }

    // �������� ��� ������� ob
    void showType() {
        System.out.println("������ ob ��������� � ���� " + ob.getClass().getName());
    }
}

//������������������ ������������ �����
public class NonGenDemo {
    public static void main(String args[]) {
        NonGen iOb;

        // ������� ������ ���� NonGen � ��������� � ���
        // ������ ���� Integer. ����������� ������������
        iOb = new NonGen(88);

        // �������� ��� ������, ���������� � ���������� iOb
        iOb.showType();

        // �������� �������� ���������� iOb,
        // �� ���� ��� ��������� ���������� �����
        int v = (Integer) iOb.getob();
        System.out.println("��������: " + v);
        System.out.println();

        // ������� ������ ������ ���� NonGen �
        // ��������� � ��� ������ ���� String
        NonGen strOb = new NonGen("���� ��� ���������");

        // �������� ��� ������, ���������� � ���������� strOb
        strOb.showType();

        // �������� �������� ���������� strOb,
        // �� ���� ��� ��������� ���������� �����
        String str = (String) strOb.getob();
        System.out.println("��������: " + str);
        System.out.println();

        //���� ��� �������������, �� �� ������������� ��������!
        iOb = strOb;
        v = (Integer) iOb.getob(); // ������ �� ����� ����������!
    }

}
