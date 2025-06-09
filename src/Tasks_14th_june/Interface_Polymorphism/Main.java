package Tasks_14th_june.Interface_Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Interface reference
        Playable instrument;

        // Point to Guitar
        instrument = new Guitar();
        instrument.play();  // Output: Playing Guitar

        // Point to Piano
        instrument = new Piano();
        instrument.play();  // Output: Playing Piano
    }
}
