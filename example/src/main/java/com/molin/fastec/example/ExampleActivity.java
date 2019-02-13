package com.molin.fastec.example;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;

import com.molin.latte.activitys.ProxyActivity;
import com.molin.latte.delegates.LatteDelegate;
import com.molin.latte.ec.launcher.LauncherDelegate;
import com.molin.latte.ec.launcher.LauncherScrollDelegate;
import com.molin.latte.ec.sign.SignUpDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }

    @Override
    public LatteDelegate setRootDelegate() {
        return new SignUpDelegate();
    }

}
