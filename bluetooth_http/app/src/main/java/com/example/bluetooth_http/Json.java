package com.example.bluetooth_http;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class Json {

    /**
     * @param Uuid
     * @param Major
     * @param Minor
     * @param Rssi
     * @return
     */
    String Uuid;
    String Major;
    String Minor;
    String Rssi;
    JSONObject jsonOb;
    JSONObject jsonObOutdoor;
    JSONArray beaconsJson;
    JSONObject main;

    Json(String Uuid, String Major, String Minor, String Rssi){
        this.Uuid=Uuid;
        this.Major=Major;
        this.Minor=Minor;
        this.Rssi=Rssi;
        jsonOb = new JSONObject();
        jsonObOutdoor = new JSONObject();
        beaconsJson = new JSONArray();
        main=new JSONObject();
    }

    public Json() {
        jsonOb = new JSONObject();
        jsonObOutdoor = new JSONObject();
        beaconsJson = new JSONArray();
        main=new JSONObject();
    }

    public void createMyJsonIndoor() throws JSONException {
        jsonOb.put("major", Integer.parseInt(Major));
        jsonOb.put("minor", Integer.parseInt(Minor));
        jsonOb.put("rssi", Integer.parseInt(Rssi));
        beaconsJson.put(jsonOb);
        //main.put("location",beaconsJson);
    }
    public void updateMyJsonIndoor( String Major, String Minor, String Rssi) throws JSONException {
        JSONObject json = new JSONObject();
        json.put("major", Integer.parseInt(Major));
        json.put("minor", Integer.parseInt(Minor));
        json.put("rssi", Integer.parseInt(Rssi));
        beaconsJson.put(json);
        //main.put("location",beaconsJson);//
    }


    public String readMyJson()throws JSONException {
        String jsonStr = "";
        JSONObject json_i;
        for(int i=0;i<beaconsJson.length();i++){
            json_i = beaconsJson.getJSONObject(i);
            jsonStr+="json[]="+json_i.toString()+"&";
        }
        jsonStr+="algorithim=1";
        return jsonStr;
        //return beaconsJson.toString();
    }
}
