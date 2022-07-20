package com.kraken.websockets.client;

import java.util.ArrayList;
import java.util.List;

public class SocketData {
    public String URI;
    public String subscriptionMessage;
    public String returnedMessage;
    public int countDown;
    public int timeOut;
    public int statusCode;
    public List<String> messagesList=new ArrayList<>();
}
