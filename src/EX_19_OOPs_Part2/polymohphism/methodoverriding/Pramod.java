package EX_19_OOPs_Part2.polymohphism.methodoverriding;

public class Pramod extends Father {
    void p1(){
        System.out.println("pramod - p1");
    }

    @Override
    void home(){
        System.out.println("pramod - 3BHK");
    }

}
