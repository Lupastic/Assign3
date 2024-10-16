class LowPriorityHandler extends TaskHandler {
    public LowPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Task task) {
        if (task.getPriority().equals("low")) {
            System.out.println("Low priority handler is processing task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(task);
        }
    }
}