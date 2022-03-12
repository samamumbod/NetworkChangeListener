package com.network.detectnetworkchange;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


/**
 * This class helps to continuously listen if a the phone is
 * connected to a network.
 */
public class NetworkChangeListener extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if (!Common.isConnectedToInternet(context))
        {
            Toast.makeText(context,"No Internet Connection",Toast.LENGTH_LONG).show();
        }
    }

}
