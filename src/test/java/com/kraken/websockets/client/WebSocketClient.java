package com.kraken.websockets.client;

import java.net.http.WebSocket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CountDownLatch;

public class WebSocketClient implements WebSocket.Listener {
    private final CountDownLatch latch;
    SocketData data;

    public WebSocketClient(CountDownLatch latch, SocketData data) {
        this.latch = latch;
        this.data = data;
    }

    @Override
    public void onOpen(WebSocket webSocket) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()) + ": Connected to WebSocket server: " + this.data.URI);
        WebSocket.Listener.super.onOpen(webSocket);
    }

    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()) + ": " + data);
        this.data.returnedMessage = data.toString();
        latch.countDown();
        return WebSocket.Listener.super.onText(webSocket, data, false);
    }

    @Override
    public void onError(WebSocket webSocket, Throwable error) {
        System.out.println("ERROR OCCURRED: " + webSocket.toString());
        WebSocket.Listener.super.onError(webSocket, error);
    }

    @Override
    public CompletionStage<?> onClose(WebSocket webSocket, int code, String reason) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()) + ": Disconnected from websocket server: " + this.data.URI);
        return WebSocket.Listener.super.onClose(webSocket, code, reason);
    }

}
