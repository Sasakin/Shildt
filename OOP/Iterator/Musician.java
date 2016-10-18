package Iterator;

public class Musician implements Collection {
    private String name;
    private String[] skils;

    public Musician(String name, String[] skils) {
        this.name = name;
        this.skils = skils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkils() {
        return skils;
    }

    public void setSkils(String[] skils) {
        this.skils = skils;
    }

    @Override
    public Iterator getIterator() {
        return new skillIterator();
    }

    private class skillIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {
            if(index<skils.length) {
                return true;
            }
                return false;
        }

        @Override
        public Object next() {
            return skils[index++];
        }
    }
}
