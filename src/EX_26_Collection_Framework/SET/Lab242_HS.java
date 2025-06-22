package EX_26_Collection_Framework.SET;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Lab242_HS {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(9);
        set.add(3);
        set.add(1);
        System.out.println("Set elements: " + set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
