package com.github.OMEN44;

import java.util.HashMap;
import java.util.Map;

public abstract class OmenChatPlugin {

    Map<String, Command> commandMap;

    abstract public String getName();

    abstract public void onEnable();

    abstract public void onDisable();

    public Command getCommandExecutor(String id) {
        if (id != null) {
            return commandMap.get(getName() + id);
        }
        throw new NullPointerException("Command id cannot be null");
    }

    public Map<String, Command> getCommandExecutors() {
        return commandMap;
    }

    public void setCommandExecutor(String name, Command command) {
        if (name != null && command != null) {
            if (!commandMap.containsKey(name)) {
                commandMap.put(getName() + name, command);
                return;
            }
        }
        throw new IllegalArgumentException("Command with this id already exists");
    }
}
