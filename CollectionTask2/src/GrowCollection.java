import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Student on 01.09.2016.
 */
public class GrowCollection extends ArrayList {

    public boolean add(Integer e) {
        ListIterator<Integer> iter = this.listIterator();
        while(iter.hasNext()) {
            Integer element = iter.next()+e;
            iter.set(element);
        }
        return super.add(e);
    }

    @Override
    public boolean add(Object o) {
        if (this.add(Integer.valueOf(o.toString()))) return true;
        else return false;
    }

    public void add(int index, Integer e) {
        ListIterator<Integer> iter = this.listIterator();
        while(iter.hasNext()) {
                Integer element = iter.next() + e;
                iter.set(element);

        }
        super.add(index, e);
    }

    @Override
    public void add(int index, Object element) {
        this.add(index, Integer.valueOf(element.toString()));
    }

    @Override
    public Object remove(int index) {
        ListIterator<Integer> iter = this.listIterator();
        Integer e = Integer.valueOf(this.get(index).toString());
        while (iter.hasNext()) {
            Integer element = iter.next()- e;
            iter.set(element);
        }
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
         this.remove(Integer.parseInt(o.toString()));
         return true;
    }
}

