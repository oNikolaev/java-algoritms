package algs.core.abstraction;

public class Counter {
    private String id;
    private int qnt;

    public Counter(String id) {
        this.id = id;
        this.qnt = 0;
    }

    public void increment() {
        this.qnt += 1;
    }

    public int tally() {
        return qnt;
    }

    @Override
    public String toString() {
        return qnt + " " + id;
    }
}
