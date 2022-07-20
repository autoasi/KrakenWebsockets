package com.kraken.websockets.constants;

public class PublicMessages {
    // Trade
    public static final String PUBLIC_SUB_TRADE_XBT_EUR = "{ \"event\":\"subscribe\", \"subscription\":{\"name\":\"trade\"},\"pair\":[\"XBT/USD\"] }";
    public static final String PUBLIC_SUB_TRADE_INVALID_CURRENCY = "{ \"event\":\"subscribe\", \"subscription\":{\"name\":\"trade\"},\"pair\":[\"XBT/XXX\"] }";
    // OHLC
    public static final String PUBLIC_SUB_OHLC_XBT_EUR = "{ \"event\": \"subscribe\", \"subscription\": { \"interval\": 1440, \"name\": \"ohlc\"}, \"pair\": [ \"XBT/EUR\" ]}";
    public static final String PUBLIC_SUB_OHLC_INVALID_CURRENCY = "{ \"event\": \"subscribe\", \"subscription\": { \"interval\": 1440, \"name\": \"ohlc\"}, \"pair\": [ \"XBT/XXX\" ]}";
    // Spread
    public static final String PUBLIC_SUB_SPREAD_XBT_EUR = "{ \"event\": \"subscribe\", \"subscription\": { \"name\": \"spread\"}, \"pair\": [ \"XBT/EUR\"]}";
    public static final String PUBLIC_SUB_SPREAD_XBT_EUR_ETH_USD = "{ \"event\": \"subscribe\", \"subscription\": { \"name\": \"spread\"}, \"pair\": [ \"XBT/EUR\",\"ETH/USD\" ]}";
    public static final String PUBLIC_SUB_SPREAD_INVALID_CURRENCY = "{ \"event\": \"subscribe\", \"subscription\": { \"name\": \"spread\"}, \"pair\": [ \"XBT/EUR\",\"ETH/XXX\" ]}";
    // Ticker
    public static final String PUBLIC_SUB_TICKER_BTC_USD ="{\"event\":\"subscribe\", \"subscription\":{\"name\":\"ticker\"}, \"pair\":[\"BTC/USD\"]}";
    public static final String PUBLIC_SUB_TICKER_INVALID_CURRENCY ="{\"event\":\"subscribe\", \"subscription\":{\"name\":\"ticker\"}, \"pair\":[\"BTC/XXX\"]}";
    // Book
    public static final String PUBLIC_SUB_BOOK_XBT_USD = "{ \"event\":\"subscribe\", \"subscription\":{\"name\":\"book\"},\"pair\":[\"XBT/USD\"] }";
    public static final String PUBLIC_SUB_BOOK_INVALID_CURRENCY = "{ \"event\":\"subscribe\", \"subscription\":{\"name\":\"book\"},\"pair\":[\"XBT/XXX\"] }";
}
