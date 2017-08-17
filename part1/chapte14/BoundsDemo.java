package chapte14;

/**
 * Created by sasakin on 18.07.2017.
 */
// � ���� ������ ������ Stats �������� ���� T ������ ����
// ������� Number ��� ����������� �� ���� �������
class Stats<T extends Number> {
    T[] nums; // ������ ������ Number ��� ��� ���������

    // �������� ������������ ������ �� ������ ���������
    // ������ Number ��� ��� ���������
    Stats(T[] o) {
        nums = o;
    }

    // ���������� �������� ���� double � ����� ������
    double average() {
        double sum = 0.0;

        for(int i=0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}

// ������������������ ���������� ������ Stats
public class BoundsDemo {
    public static void main(String args[]) {
        Integer inums[] = { 1, 2, 3, 4, 5 };
        Stats<Integer> iob = new Stats<Integer>(inums);
        double v = iob.average();
        System.out.println("������� �������� iob ����� " + v);

        Double dnums[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("������� �������� dob ����� " + w);

        // ���� ��� �� �������������� ��� ��� ����� String
        // �� �������� ����������� �� ������ Number
//        String strs[] = { "1", "2", "3", "4", "5" };
//        Stats<String> strob = new Stats<String>(strs);
//        double x = strs.average();
//        System.out.println("������� �������� strob ����� " + x);
    }
}
