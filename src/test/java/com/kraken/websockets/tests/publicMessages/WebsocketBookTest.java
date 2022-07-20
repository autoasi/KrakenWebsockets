package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import com.kraken.websockets.factory.WebSocketFactory;
import org.testng.annotations.Test;

public class WebsocketBookTest extends BaseTest {

    @Test(description = "Validate book payload schema")
    public void validateBookPayloadSchemaTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check number of trades is equal to book depth")
    public void checkNumberOfTradesEqualToBookDepthTest(){
        socketData.countDown = 4;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Validate asset pair is XBT/USD")
    public void validateAssetPairTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check best ask prices are in ascending order")
    public void CheckBestAskPricesAreInAscendingOrder(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check best bid prices are in descending order")
    public void CheckBestBitPricesAreInDescendingOrder(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_XBT_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Ensure invalid currency pair returns error message")
    public void ensureInvalidCurrencyPairReturnsErrorMessageTest(){
        socketData.countDown = 2;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_BOOK_INVALID_CURRENCY;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }
}
