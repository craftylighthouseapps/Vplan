package com.igs.vplan;

import android.os.Bundle;
import org.apache.cordova.*;

public class Freistundenplaner extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
        super.loadUrl("file:///android_asset/www/index.html", 5000);
    }
}
