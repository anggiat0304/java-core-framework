package javacore;

public class DataStructure {
    private final static int SIZE = 15;
    private int[] arrayOfints  = new int[SIZE];
    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfints[i] = i;
        }
    }
    public void printEven(){
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
    interface DataStructureIterator extends java.util.Iterator<Integer> {

    }
    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;
        public boolean hasNext() {
            return (nextIndex <= SIZE-1);
        }
        public Integer next() {
            Integer retValue = Integer.valueOf(arrayOfints[nextIndex]);
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] args) {
        DataStructure ds = new DataStructure();
        ds.printEven();
    }
}
