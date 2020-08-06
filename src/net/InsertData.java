/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

import com.google.gson.Gson;
import entity.Category;
import entity.Data;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import utils.Utils;

/**
 *
 * @author Youtube
 */
public class InsertData implements Runnable{
    private DbResponce dbResponce;
    private OkHttpClient client;
    private Request request;
    private int reqCode;
    private Data data;

    public InsertData(Object obj,int reqCode,Data data){
        dbResponce = (DbResponce) obj;
        this.reqCode = reqCode;
        this.data = data;
        connect(obj);
    }

    private void execute(){
        try{
            Response response = client.newCall(request).execute();

            dbResponce.responce(reqCode,response.body().string());
        }
        catch(Exception e){
            dbResponce.responce(reqCode,"");
        }
    }

    private void connect(Object obj){
        String url = Utils.BASE_URL+"/insertData";

        client = new OkHttpClient();
        
        MultipartBody.Builder b = new MultipartBody.Builder();
        b.setType(MultipartBody.FORM);
        b.addFormDataPart("data", new Gson().toJson(data));

        RequestBody body = b.build();
        request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
    }

    @Override
    public void run() {
        execute();
    }
}
