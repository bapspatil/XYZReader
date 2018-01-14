package com.example.xyzreader.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by bapspatil
 */

public class NetworkUtils {
    public static Boolean hasNetwork(Context context) {
        Boolean isConnected = false; // Initial Value
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = null;
        if (connectivityManager != null) {
            activeNetwork = connectivityManager.getActiveNetworkInfo();
        }
        if (activeNetwork != null && activeNetwork.isConnectedOrConnecting())
            isConnected = true;
        return isConnected;
    }
}
