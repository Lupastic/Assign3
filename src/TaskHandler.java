abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public TaskHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handle(Task task);
}
