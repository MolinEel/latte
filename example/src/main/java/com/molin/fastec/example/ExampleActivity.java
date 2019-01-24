package com.molin.fastec.example;


import com.molin.latte.activitys.ProxyActivity;
import com.molin.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }

}
