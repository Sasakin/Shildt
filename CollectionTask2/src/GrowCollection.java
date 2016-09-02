import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Student on 01.09.2016.
 */
public class GrowCollection<Integer> extends ArrayList<Integer> {
    @Override
    public boolean add(int e) {
        int[] array  = this.toArray(int[] a=new int[this.size()]);
        GrowCollection<Integer> g = this ;
        this.clear();
        for( Integer i:g) {
            int el = java.lang.Integer(i.toString());
            super.add(i);
        }

        //return super.add(e);

        }
    }

