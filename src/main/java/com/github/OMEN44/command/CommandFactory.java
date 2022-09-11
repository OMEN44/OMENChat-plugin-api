package com.github.OMEN44.command;

public interface CommandFactory {
    String name();

    Command build();
}
