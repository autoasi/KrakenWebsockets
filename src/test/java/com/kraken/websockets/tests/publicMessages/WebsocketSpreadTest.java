package com.kraken.websockets.tests.publicMessages;

import com.kraken.websockets.base.BaseTest;
import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.constants.PublicMessages;
import com.kraken.websockets.factory.WebSocketFactory;
import org.testng.annotations.Test;

public class WebsocketSpreadTest extends BaseTest {

    @Test(description = "Validate spread payload schema")
    public void validateSpreadPayloadSchemaTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_SPREAD_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check channel name is spread")
    public void checkChannelNameIsSpreadTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_SPREAD_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check spread asset pair is XBT/EUR")
    public void checkSpreadAssetPairTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_SPREAD_XBT_EUR;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }

    @Test(description = "Check two asset pairs return two messages")
    public void checkTwoAssetPairsReturnTwoMessagesTest(){
        socketData.countDown = 3;
        socketData.subscriptionMessage = PublicMessages.PUBLIC_SUB_SPREAD_XBT_EUR_ETH_USD;
        SocketData responseContext= WebSocketFactory.getInstance().OpenAndStreamWebSocketSubscription(socketData);
        System.out.println("RESULT>>>" + responseContext.messagesList.get(socketData.countDown-1));
        /*
            Add test logic
         */
    }
}
