package com.example.dschmid.grouporganizer.app;

/**
 * Created by DSchmid on 19.10.16.
 */

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://assemble.sacredskull.net/register";
    private Map<String, String> params;


    public RegisterRequest(String name, String username, String password, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, errorListener);
        params = new HashMap<>();
        params.put("name",name);
        params.put("username", username);
        params.put("email", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    /*@Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String,String> headerMap = new HashMap<String, String>();
        headerMap.put("Content-Type","application/json");
        return headerMap;
    }*/
}