package com.github.OMEN44;

public class Message {

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
    private String group;
    private String label;
    //the arguments are command specific
    private String[] args;
    //date that the message was sent
    private String timeSent;
    //who sent the message
    private String senderId;

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

    public Message setGroup(String group) {
        this.group = group;
        return this;
    }

    public Message setLabel(String label) {
        this.label = label;
        return this;
    }

    public Message setArgs(String... args) {
        this.args = args;
        return this;
    }

    public Message setTimeSent(String timeSent) {
        this.timeSent = timeSent;
        return this;
    }

    public Message setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
}
