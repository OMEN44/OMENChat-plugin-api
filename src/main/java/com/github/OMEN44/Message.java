package com.github.OMEN44;

public class Message {

    public Message(String group, String label, String[] args, String timeSent, String senderId) {
        this.group = group;
        this.label = label;
        this.args = args;
        this.timeSent = timeSent;
        this.senderId = senderId;
    }

    /*
        QUERIES and RESPONSES are very similar and a query must be followed with a response from the server, use these for
        getting data from the server.
        ACTIONS are for telling the other to do something and will send a success or fail response.
        UPDATES can be sent from either the client or server and should be used to carry information to the other, then the
        other with decide weather to treat it as a query or an action.

        CommandInterface:
            Q (query), R (response):
                0 - ping
                1 - login
                2 - online list
            A (action):
                0 - forward message to users
            U (update):
                0 -
        */
    //the label is the command id for example: A12
    private final String group;
    private final String label;
    //the arguments are command specific
    private final String[] args;
    //date that the message was sent
    private final String timeSent;
    //who sent the message
    private final String senderId;

    public String getGroup() {
        return group;
    }

    public String getLabel() {
        return label;
    }

    public String[] getArgs() {
        return args;
    }

    public String getTimeSent() {
        return timeSent;
    }

    public String getSenderId() {
        return senderId;
    }
}
