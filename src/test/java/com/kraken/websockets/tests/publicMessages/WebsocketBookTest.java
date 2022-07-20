package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import com.kraken.websockets.factory.WebSocketFactory;
import org.testng.annotations.Test;

import java.util.Base64;

public class WebsocketBookTest extends BaseTest {

    @Test(description = "Validate book payload schema")
    public void validateBookPayloadSchemaTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Check number of trades is equal to book depth")
    public void checkNumberOfTradesEqualToBookDepthTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Validate asset pair is XBT/USD")
    public void validateAssetPairTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Check best ask prices are in ascending order")
    public void CheckBestAskPricesAreInAscendingOrder(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Check best bid prices are in descending order")
    public void CheckBestBitPricesAreInDescendingOrder(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }

    @Test(description = "Ensure invalid currency pair returns error message")
    public void ensureInvalidCurrencyPairReturnsErrorMessageTest(){
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_INVALID_CURRENCY;
       // SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
       // System.out.println("RESULT>>>" +responseContext.returnedMessage);
        /*
            Add test logic
         */
    }
}
