package EX_19_OOPs_Part2.accessModifer.Police;

public class Cop {
    private int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }


    private void defaultFunction(){

    }
}
