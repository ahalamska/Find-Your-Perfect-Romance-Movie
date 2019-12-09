package si.movie;

import javax.swing.*;

public class UserInterface {

    private static JFrame frame;

    public static int askQuestion(String question, String[] options) {

        return JOptionPane.showOptionDialog(
                frame,
                question,
                question,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );
    }

    public static void showResult(String answer) {
        JOptionPane.showMessageDialog(frame, answer);
    }
}
