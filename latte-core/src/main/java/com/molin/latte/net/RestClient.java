package com.molin.latte.net;

import com.molin.latte.net.callback.IError;
import com.molin.latte.net.callback.IFailure;
import com.molin.latte.net.callback.IRequest;
import com.molin.latte.net.callback.ISuccess;

import java.util.Map;
import java.util.WeakHashMap;

import okhttp3.RequestBody;

/**
 * Created by Molin on 2019/1/24.
 */

public class RestClient {

    private final String URL;
    private static final WeakHashMap<String, Object> PARAMS = RestCreator.getParams();
    private final ISuccess SUCCESS;
    private final IFailure FAILURE;
    private final IError ERROR;
    private final IRequest REQUEST;
    private final RequestBody BODY;

    public RestClient(String url,
                      Map<String, Object> params,
                      ISuccess success,
                      IFailure failure,
                      IError error,
                      IRequest request,
                      RequestBody body) {
        this.URL = url;
        PARAMS.putAll(params);
        this.SUCCESS = success;
        this.FAILURE = failure;
        this.ERROR = error;
        this.REQUEST = request;
        this.BODY = body;
    }

    public static RestClientBuilder builder() {
        return new RestClientBuilder();
    }
}
