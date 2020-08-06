/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net;

import com.google.gson.Gson;
import entity.Category;
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
public class GetAllCategory implements Runnable{
    private DbResponce dbResponce;
    private OkHttpClient client;
    private Request request;
    private int reqCode;

    public GetAllCategory(Object obj,int reqCode){
        dbResponce = (DbResponce) obj;
        this.reqCode = reqCode;
        connect(obj);
    }

    private void execute(){
        try{
            
            Response response = client.newCall(request).execute();
            
            dbResponce.responce(reqCode,response.body().string());
        }
        catch(Exception e){
            System.out.println("exp"+e.toString());
            dbResponce.responce(reqCode,"");
        }
    }

    private void connect(Object obj){
        String url = Utils.BASE_URL+"/getAllCategory";

        client = new OkHttpClient();
        
        request = new Request.Builder()
                .url(url)
                .get()
                .build();
    }

    @Override
    public void run() {
        execute();
    }
}
