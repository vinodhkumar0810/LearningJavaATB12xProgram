package EX_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
//        System.out.println(marks[-1]); // //ArrayIndexOutOfBoundsException
//        System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException

        char c = 'A';
        String name = "pramod";
        String[] name_each_element_char = name.split("");
        // ["p","r","o","m","d"]


    }
}
