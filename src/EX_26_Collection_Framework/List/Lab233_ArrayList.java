package EX_26_Collection_Framework.List;
import java.util.*;
public class Lab233_ArrayList {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks);
//        Collections.sort(marks);
//        System.out.println(marks);


        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);




    }
}
