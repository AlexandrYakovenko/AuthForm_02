import controller.Controller;
import model.entity.Note;
import view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller =
                new Controller(new Note(), new View());

        controller.processUser();
    }
}
