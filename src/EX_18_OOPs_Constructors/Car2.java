package EX_18_OOPs_Constructors;

public class Car2 {
    String model;
    int year;

    Car2(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    Car2(String model_name,int year_created){
        this.model = model_name;
        this.year = year_created;
    }

    Car2(String model_name){
        this.model = model_name;
    }

}
