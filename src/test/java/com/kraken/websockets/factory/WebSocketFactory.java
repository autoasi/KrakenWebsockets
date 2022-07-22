package com.kraken.websockets.factory;

import com.kraken.websockets.client.SocketData;
import com.kraken.websockets.client.WebSocketClient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.concurrent.CountDownLatch;

public class WebSocketFactory {

    private WebSocketFactory() {
    }

    public static WebSocketFactory getInstance() {
        return new WebSocketFactory();
    }

    public static SocketData OpenAndStreamWebSocketSubscription(SocketData data) {
        try {
            CountDownLatch latch = new CountDownLatch(data.getCountDown());
            WebSocket ws = HttpClient
                    .newHttpClient()
                    .newWebSocketBuilder()
                    .buildAsync(URI.create(data.getURI()), new WebSocketClient(latch,data))
                    .join();
            ws.sendText(data.getSubscriptionMessage(), true);
            latch.await();

        } catch (Exception e) {
            System.out.println();
            System.out.println("AN EXCEPTION OCCURRED :(");
            System.out.println(e);
        }
        return data;
    }

}



