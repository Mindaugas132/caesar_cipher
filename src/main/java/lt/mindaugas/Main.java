package lt.mindaugas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Rome");

        Encoder simpleText = new Encoder("A\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW\tX\tY\tZ");
        Decoder decode1 = new Decoder("X\tY\tZ\tA\tB\tC\tD\tE\tF\tG\tH\tI\tJ\tK\tL\tM\tN\tO\tP\tQ\tR\tS\tT\tU\tV\tW");

        decode1.encodeText();

        simpleText.encodeText();

        System.out.println(simpleText.getCypher());
        System.out.println(decode1.getPlainText());
    }


}