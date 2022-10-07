package com.github.OMEN44;

public interface Command {
    /**
     * @param label Name of the command being sent
     * @param sender user or source of the command
     * @param timeSent Time that the message was sent
     * @param args arguments sent for the command
     * @return Returns the success of the command
     */
    Message execute(String label, String sender, String timeSent, String[] args);

}
