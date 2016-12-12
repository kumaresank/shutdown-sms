package com.example.shutdownsms.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.SmsManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by qencpu01 on 1/9/14.
 */
public class Shutdown extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(Intent.ACTION_SHUTDOWN.equalsIgnoreCase(intent.getAction())) {
            Toast.makeText(context, "Shutdown", Toast.LENGTH_LONG).show();
            SmsManager sms= SmsManager.getDefault();
            sms.sendTextMessage("9042403030", null,"My Mobile Getting Switched Off",null,null);
        }

    }
}
