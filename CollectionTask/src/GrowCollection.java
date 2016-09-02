import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Student on 31.08.2016.
 */
public class GrowCollection  {

    private int[] array = new int[0];

    public void addToEnd(int element){        // ������ ����� ��������� ������� � ����� ��������� � ����������
        int[] rearray = array;                // �������� �������� � ��������� ��������� ���������
        array = new int[array.length+1];
        array[array.length-1] = element;
        for( int i=0;i<array.length-1;i++) {
            array[i] = rearray[i]+element;
        }
    }
    public void addByIndex(int element, int index){        // �������� �� �������
        int[] rearray = array;
        array = new int[array.length+1];
        array[index] = element;
        for( int i=0;i<array.length;i++) {
            if(i<index)
                array[i] = rearray[i]+element;
            if(i>index)
                array[i] = rearray[i-1]+element;
        }
    }
    public void addToBeginning(int element){        // �������� � ������
        int[] rearray = array;
        array = new int[array.length+1];
        array[0] = element;
        for( int i=1;i<array.length;i++) {
            array[i] = rearray[i-1]+element;
        }
    }
    public void removeToEnd(){                   // ������ ����� ������� ��������� ������� ��������� � �������� ��������
        int[] rearray = array;                  // �������� �� ��������� ���������
        int element = array[array.length-1];
        array = new int[array.length-1];
        for( int i=0;i<array.length;i++) {
            array[i] = rearray[i]-element;
        }
    }
    public void removeByIndex( int index){        // ������� �� �������
        int[] rearray = array;
        array = new int[array.length-1];
        int element = rearray[index];
        for( int i=0;i<array.length;i++) {
            if(i<index)
                array[i] = rearray[i]-element;
            if(i>=index)
                array[i] = rearray[i+1]-element;
        }
    }
    public void removeToBeginning(){        // ������� �� ������
        int[] rearray = array;
        array = new int[array.length-1];
        int element = rearray[0];
        for( int i=0;i<array.length;i++) {
            array[i] = rearray[i+1]-element;
        }
    }
    public int getSize() {
        return array.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append("[");
        for(int i=0;i<array.length;i++) {
            str.append(array[i]);
            if(i<array.length-1)
                str.append(", ");
        }
        str.append("]");
        String result = str.toString();
        return result;
    }

}



