import java.util.Iterator;
import java.util.List;

public class TaskListIterator implements Iterator<Task> {
    private List<Task> taskList;
    private int index = 0;

    public TaskListIterator(List<Task> taskList) {
        this.taskList = taskList;
    }

    @Override
    public boolean hasNext() {
        return index < taskList.size();
    }

    @Override
    public Task next() {
        if (hasNext()) {
            return taskList.get(index++);
        }
        return null;
    }
}