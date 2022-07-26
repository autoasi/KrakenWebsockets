package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.factory.WebSocketFactory;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import org.testng.annotations.Test;

public class WebSocketOHLCTest extends BaseTest {

    @Test(description = "Validate OHLC payload schema")
    public void validateOHLCPayloadSchemaTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_OHLC_XBT_EUR);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check high price is greater than low price")
    public void CheckHighPriceIsGreaterThanLowPriceTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_OHLC_XBT_EUR);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check epoch interval duration is correct")
    public void checkEpochIntervalDurationTest(){
        socketData.setCountDown(3);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_OHLC_XBT_EUR);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Ensure invalid currency pair returns error message")
    public void ensureInvalidCurrencyPairReturnsErrorMessageTest(){
        socketData.setCountDown(2);
        socketData.setSubscriptionMessage(PublicMessages.PUBLIC_SUB_OHLC_INVALID_CURRENCY);
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.getMessagesList().get(socketData.getCountDown()-1));
        /*
            Add test logic
         */
    }
}
