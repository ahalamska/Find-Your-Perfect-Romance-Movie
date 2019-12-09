package si.movie;

import org.kie.api.runtime.KieRuntime;

import java.util.stream.Stream;

public class QuestionManager {

    public static KieRuntime KIE_RUNTIME;

    public static void askQuestion(Questions question, Answers... answers) {
        int n = UserInterface.askQuestion(question.getValue(), Stream.of(answers)
                .map(Answers::getValue)
                .toArray(String[]::new));

        Question q = new Question(question, answers[n]);
        KIE_RUNTIME.insert(q);
    }

    public static void showResult(String result) {
        UserInterface.showResult(result);
    }
}
