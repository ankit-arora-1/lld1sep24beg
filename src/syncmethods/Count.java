package syncmethods;

public class Count {
    private int val = 0;

    public synchronized void incrVal(int count) {
        val += count;
    }

    public int getVal() {
        return val;
    }
}
