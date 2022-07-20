package com.kraken.websockets.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SocketData {
    public String URI;
    public String subscriptionMessage;
    public String returnedMessage;
    public int timeOut;
    public int statusCode;
    public List<String> messagesList=new ArrayList<>();
}
