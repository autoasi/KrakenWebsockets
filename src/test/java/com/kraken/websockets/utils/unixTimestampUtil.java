package com.kraken.websockets.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class unixTimestampUtil {

    public static String convertUnixTimestamp(long unixSeconds)   {
        Date date = new java.util.Date(unixSeconds*1000L);
        SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        // timezone reference for formatting
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT+1"));
        return sdf.format(date);
    }
}
