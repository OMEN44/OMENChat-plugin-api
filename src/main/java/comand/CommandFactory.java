package comand;

public interface CommandFactory {
    String name();

    Command build();
}
