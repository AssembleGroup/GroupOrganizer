package com.example.dschmid.grouporganizer.app;

/**
 * Created by DSchmid on 19.10.16.
 */

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://assemble.sacredskull.net/register";
    private Map<String, String> params;

    public RegisterRequest(String name, String username, String password, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("Name", name);

        params.put("Username", username);
        params.put("Password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}