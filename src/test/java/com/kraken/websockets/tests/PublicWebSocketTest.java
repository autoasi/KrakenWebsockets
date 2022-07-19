package com.kraken.websockets.tests;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.factory.WebSocketFactory;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import org.testng.annotations.Test;

public class PublicWebSocketTest extends BaseTest {


    @Test(description = "Add description")
    public void tradeTest(){

        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Add description")
    public void OHLCTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_OHLC_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Add test description")
    public void spreadTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_SPREAD_XBT_EUR_ETH_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Add test description")
    public void tickerTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TICKER_BTC_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Add test description")
    public void bookTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }
}
