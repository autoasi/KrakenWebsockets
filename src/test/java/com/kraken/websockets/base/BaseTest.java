package com.kraken.websockets.base;

import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.Config;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected SocketData socketData;

    @BeforeTest
    public void createSocketData(){
        socketData = new SocketData();
        socketData.URI = Config.WEBSOCKET_URI;
        socketData.timeOut=5;
    }

    @AfterTest
    public void closeWebSocket(){

    }
}
