package com.reebrandogmail.logger;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by logonrm on 12/06/2017.
 */

public class Logger extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("Service", "Service initialized");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Service", "Service finalized");
    }
}
