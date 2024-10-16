import java.util.ArrayList;
import java.util.List;

public class TaskMediator {
    private List<TaskHandler> handlers = new ArrayList<>();

    public void addHandler(TaskHandler handler) {
        handlers.add(handler);
    }

    public void distributeTask(Task task) {
        if (!handlers.isEmpty()) {
            handlers.get(0).handle(task);
        }
    }
}
