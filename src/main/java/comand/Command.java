package comand;

public interface Command {
    void execute(String label, String sender, String timeSent, String[] args);
}
