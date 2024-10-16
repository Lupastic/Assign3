class MediumPriorityHandler extends TaskHandler {
    public MediumPriorityHandler(TaskHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Task task) {
        if (task.getPriority().equals("medium")) {
            System.out.println("Medium priority handler is processing task: " + task.getName());
        } else if (nextHandler != null) {
            nextHandler.handle(task);
        }
    }
}