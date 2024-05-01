package lt.mindaugas;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Thank you for using Caesar cipher TOOLBOX, your secrets are really not safe with us!");

        IOManager ioManager = new IOManager();
        ioManager.enterMessage();
        ioManager.chooseAction();

        switch (ioManager.getAction()) {
            case 1 -> {
                Encoder encoder = new Encoder(ioManager.getInputMessage());
                encoder.encodeText();
                ioManager.getCodedMessage(encoder.getCypher());
            }
            case 2 -> {
                Decoder decoder = new Decoder(ioManager.getInputMessage());
                decoder.decodeCypher();
                ioManager.getCodedMessage(decoder.getPlainText());
            }
            default -> {
                System.out.println("Invalid input: " + ioManager.getAction());
            }
        }
    }


}