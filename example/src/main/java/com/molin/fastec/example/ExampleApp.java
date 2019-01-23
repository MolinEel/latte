package com.molin.fastec.example;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.molin.latte.app.Latte;
import com.molin.latte.ec.icon.FontEcModule;

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
                .withHost("http://www.baidu.com")
                .configure();
    }
}
