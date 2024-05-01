package lt.mindaugas;

import lt.mindaugas.common.Colors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOManager {
    private int action;
    private String inputMessage;

    public int getAction() {
        return action;
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public void chooseAction() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean inputCorrect = false;

        System.out.printf(
                "Please, enter a number to choose what you want to do with your message: %n" +
                        "%1$s 1 - Encode text %3$s %n" +
                        "%2$s 2 - Decode text %3$s %n", Colors.GREEN.value, Colors.YELLOW.value, Colors.RESET.value
        );

        do {
            try {
                this.action = Integer.parseInt(reader.readLine());
                inputCorrect = true;

                if (this.action > 2 || this.action < 1) {
                    System.out.println("Please enter only '1' or '2'");
                    inputCorrect = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("You can enter only numbers: '1' or '2' \n" +
                        "1 - Encode text \n" +
                        "2 - Decode text"
                );
            }
        }
        while (!inputCorrect);

    }

    public void enterMessage() throws IOException {
        System.out.println("Enter your message: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        this.inputMessage = reader.readLine();
        System.out.println("Your message has been saved!");
    }

    public void getCodedMessage(String text) {
        System.out.printf("Your secret text is: %s %s %s ", Colors.PURPLE.value, text, Colors.RESET.value);
    }

}