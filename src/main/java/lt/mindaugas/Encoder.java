package lt.mindaugas;

public class Encoder {
    private final String plainText;
    private String cypher;

    public Encoder(String plainText) {
        this.plainText = plainText;
    }

    public String getCypher() {
        return cypher;
    }

    private char changeChar(char letter) {
        char localChar = Character.toUpperCase(letter);

        // In ASCII letters A-Z are in interval 65-90
        if (localChar > 64 && localChar < 91) {
            if (localChar < 68) {
                localChar = (char) ((65 - localChar) + 'Z');
            } else {
                localChar = (char) (localChar - 3);
            }
        }
        return localChar;
    }

    public void encodeText() {
        StringBuilder sb = new StringBuilder(this.plainText);

        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, changeChar(sb.charAt(i)));
        }
        this.cypher = sb.toString();
    }
}
