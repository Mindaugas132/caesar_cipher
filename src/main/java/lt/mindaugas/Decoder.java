package lt.mindaugas;

public class Decoder {
    private final String cypher;
    private String plainText;


    public Decoder(String cypher) {
        this.cypher = cypher;
    }

    public String getPlainText() {
        return plainText;
    }

    private char changeChar(char letter) {
        char localChar = Character.toUpperCase(letter);

        // In ASCII letters A-Z are in interval 65-90
        if (localChar > 64 && localChar < 91) {
            if (localChar > 87) {
                localChar = (char) ((localChar - 88) + 'A');
            } else {
                localChar = (char) (localChar + 3);
            }
        }
        return localChar;
    }

    public void encodeText() {
        StringBuilder sb = new StringBuilder(this.cypher);

        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, changeChar(sb.charAt(i)));
        }
        this.plainText = sb.toString();
    }
}
