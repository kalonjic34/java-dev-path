public class TodoItem {
    private String title;
    private int priority;

    public TodoItem(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }


    public String getTitle() {
        return this.title;
    }


    public int getPriority() {
        return this.priority;
    }
    
}