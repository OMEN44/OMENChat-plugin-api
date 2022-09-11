package com.github.OMEN44.comand;

public interface Command {
    void execute(String label, String sender, String timeSent, String[] args);
}
