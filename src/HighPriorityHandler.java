class HighPriorityHandler extends TaskHandler {
    public HighPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Task task) {
        if (task.getPriority().equals("high")) {
            System.out.println("High priority handler is processing task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(task);
        }
    }
}