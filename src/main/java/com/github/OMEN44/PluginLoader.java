package com.github.OMEN44;

import java.util.HashMap;

public class PluginLoader {
    public static OmenChatPlugin enable(OmenChatPlugin plugin) {
        plugin.commandMap = new HashMap<>();
        plugin.onEnable();
        return plugin;
    }
}
