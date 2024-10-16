class CancelTaskCommand implements Command {
    private Task task;

    public CancelTaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Cancelling task: " + task.getName());
    }
}