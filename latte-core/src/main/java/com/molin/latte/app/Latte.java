package com.molin.latte.app;

import android.app.Application;
import android.content.Context;

import java.util.HashMap;

/**
 * Created by LEEP_COMPUTER on 2019/1/23.
 */

public final class Latte {
    /*防止别人继承*/


    public static Configurator init(Context context) {
        Configurator.getInstance().getLatteConfigs()
                .put(ConfigKeys.APPLICATION_CONTEXT, context);
        return Configurator.getInstance();
    }

    public static Configurator getConfigurator() {
        return Configurator.getInstance();
    }

    public static <T> T getConfiguration(Object key) {
        return getConfigurator().getConfiguration(key);
    }

    public static Application getApplicationContext() {
        return getConfiguration(ConfigKeys.APPLICATION_CONTEXT);
    }
}
