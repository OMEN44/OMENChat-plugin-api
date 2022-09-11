package com.github.OMEN44;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface OmenChatPlugin {
    Map<String, Command> commandMap = new HashMap<>();

    default List<CommandFactory> getCommandFactories() {
        return Collections.emptyList();
    }
}
