package JavaWrapperClasses;

public class Pair <F, S> {
    private F first;
    private S second;
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public F getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }
    public void setFirst(F first) {
        this.first = first;
    }
    public void setSecond(S second) {
        this.second = second;
    }
    @Override
    public String toString() {
        return "First: " + first + ", Second: " + second;
    }
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Test", 100);
        System.out.println(pair);
    }
}
