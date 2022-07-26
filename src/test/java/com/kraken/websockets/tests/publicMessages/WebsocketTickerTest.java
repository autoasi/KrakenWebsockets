package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import com.kraken.websockets.factory.WebSocketFactory;
import org.testng.annotations.Test;

public class WebsocketTickerTest extends BaseTest {

    @Test(description = "Validate ticker payload schema")
    public void validateTickerPayloadSchemaTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_BTC_USD);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check channel name is ticker")
    public void checkChannelNameIsTickerTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_BTC_USD);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check ticker asset pair is BTC/USD")
    public void checkTickerAssetPairTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_BTC_USD);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check high value today is greater than low value today")
    public void checkHighValueTodayIsGreaterThanLowValueTodayTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_BTC_USD);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check high value at last 24 hrs is greater than low value at last 24 hrs")
    public void checkValueAtLast24HoursIsGreaterThanLowValueAtLast24HoursTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_BTC_USD);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Ensure invalid currency pair returns error message")
    public void ensureInvalidCurrencyPairReturnsErrorMessageTest(){
        socketData.setCountDown(2);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_TICKER_INVALID_CURRENCY);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

}
