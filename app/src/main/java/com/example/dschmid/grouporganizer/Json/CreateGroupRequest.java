package com.example.dschmid.grouporganizer.Json;

/**
 * Created by DSchmid on 19.10.16.
 */

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class CreateGroupRequest extends StringRequest {
    private static final String REQUEST_URL = "http://assemble.sacredskull.net/group";
    private Map<String, String> params;


    public CreateGroupRequest(String name, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(Method.POST, REQUEST_URL, listener, errorListener);
        params = new HashMap<>();
        params.put("name",name);

    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String,String> headerMap = new HashMap<String, String>();
        headerMap.put("Content-Type","application/json");
        return headerMap;
    }
}