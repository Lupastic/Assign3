import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Creating tasks
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Design", "low"));
        tasks.add(new Task("Code Review", "medium"));
        tasks.add(new Task("Deployment", "high"));

        TaskHandler handlerChain = new LowPriorityHandler(new MediumPriorityHandler(new HighPriorityHandler(null)));

        TaskMediator mediator = new TaskMediator();
        mediator.addHandler(handlerChain);

        List<Command> commands = new ArrayList<>();
        for (Task task : tasks) {
            commands.add(new ExecuteTaskCommand(task));
        }

        for (Task task : tasks) {
            mediator.distributeTask(task);
        }

        for (Command command : commands) {
            command.execute();
        }

        TaskListIterator taskIterator = new TaskListIterator(tasks);
        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();
            System.out.println("Task in iterator: " + task.getName() + " - Priority: " + task.getPriority());
        }
    }
}