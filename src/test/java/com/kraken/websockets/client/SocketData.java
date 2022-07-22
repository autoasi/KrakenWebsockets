package com.kraken.websockets.client;

import java.util.ArrayList;
import java.util.List;

public class SocketData {
    private String URI;
    private String subscriptionMessage;
    private String returnedMessage;
    private int countDown;
    private int timeOut;
    private int statusCode;
    private List<String> messagesList=new ArrayList<>();

    public SocketData() {
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getSubscriptionMessage() {
        return subscriptionMessage;
    }

    public void setSubscriptionMessage(String subscriptionMessage) {
        this.subscriptionMessage = subscriptionMessage;
    }

    public String getReturnedMessage() {
        return returnedMessage;
    }

    public void setReturnedMessage(String returnedMessage) {
        this.returnedMessage = returnedMessage;
    }

    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public List<String> getMessagesList() {
        return messagesList;
    }

    public void setMessagesList(List<String> messagesList) {
        this.messagesList = messagesList;
    }
}
