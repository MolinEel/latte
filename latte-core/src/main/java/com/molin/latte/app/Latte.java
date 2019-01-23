package com.molin.latte.app;

import android.content.Context;

import java.util.HashMap;

/**
 * Created by LEEP_COMPUTER on 2019/1/23.
 */

public final class Latte {
    /*防止别人继承*/


    public static Configurator init(Context context) {
        getConfiguraations().put(ConfigKeys.APPLICATION_CONTEXT.name(), context);
        return Configurator.getInstance();
    }

    private static HashMap<Object, Object> getConfiguraations() {
        return Configurator.getInstance().getLatteConfigs();
    }
}
