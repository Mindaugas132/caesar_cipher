package lt.mindaugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rome");

        Encoder simpleText = new Encoder("A B C D E F Z X C V");

        simpleText.encodeText();

        System.out.println(simpleText.getCypher());
    }


}