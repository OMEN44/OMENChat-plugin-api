package com.github.OMEN44;

import java.util.HashMap;
import java.util.Map;

public interface OmenChatPlugin {

    Map<String, Command> commandMap = new HashMap<>();

    void onLoad();

    void onDisable();

    default Command getCommandExecutor(String id) {
        if (id != null) {
            return commandMap.get(id);
        }
        throw new NullPointerException("Command id cannot be null");
    }

    default Map<String, Command> getCommandExecutors() {
        return commandMap;
    }

    default void setCommandExecutor(String name, Command command) {
        if (name != null && command != null) {
            if (!commandMap.containsKey(name)) {
                commandMap.put(name, command);
                return;
            }
        }
        throw new IllegalArgumentException("Command with this id already exists");
    }
}
