package com.github.OMEN44.command;

public interface Command {
    void execute(String label, String sender, String timeSent, String[] args);
}
