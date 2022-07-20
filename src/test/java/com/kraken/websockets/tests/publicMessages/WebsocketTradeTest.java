package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import com.kraken.websockets.factory.WebSocketFactory;
import org.testng.annotations.Test;

public class WebsocketTradeTest extends BaseTest {

    @Test(description = "Validate trade payload schema")
    public void validateTradePayloadSchemaTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Validate channel name is trade")
    public void validateChannelNameIsTradeTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Validate asset pair is XBT/EUR")
    public void validateAssetPairTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Check triggering order side is either buy or sell")
    public void checkTriggerOrderSideTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Check triggering order type is either market or limit")
    public void checkTriggerOrderTypeTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Ensure invalid currency pair returns error message")
    public void ensureInvalidCurrencyPairReturnsErrorMessageTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_TRADE_INVALID_CURRENCY;
        //  SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        //  System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }


}
