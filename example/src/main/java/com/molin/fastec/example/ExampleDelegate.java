package com.molin.fastec.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.molin.latte.delegates.LatteDelegate;
import com.molin.latte.net.RestClient;
import com.molin.latte.net.callback.IError;
import com.molin.latte.net.callback.IFailure;
import com.molin.latte.net.callback.ISuccess;

/**
 * Created by Molin on 2019/1/24.
 */

public class ExampleDelegate extends LatteDelegate {

    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    private void testRestClient() {
        RestClient.builder()
                .url("")
                .params("", "")
                .success(new ISuccess() {
                    @Override
                    public void onSuccess(String response) {

                    }
                })
                .error(new IError() {
                    @Override
                    public void onError(String response) {

                    }
                })
                .failure(new IFailure() {
                    @Override
                    public void onFailure() {

                    }
                })
                .build();

    }
}
