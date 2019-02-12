package com.molin.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.molin.latte.app.Latte;
import com.molin.latte.ec.icon.FontEcModule;
import com.molin.latte.net.interceptors.DebugInterceptor;

/**
 * Created by LEEP_COMPUTER on 2019/1/23.
 */

public class ExampleApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .withIcon(new FontEcModule())
                .withHost("http://127.0.0.1/")
                .withInterceptor(new DebugInterceptor("index",R.raw.test))
                .configure();
    }
}
