package com.github.OMEN44.comand;

public interface CommandFactory {
    String name();

    Command build();
}
