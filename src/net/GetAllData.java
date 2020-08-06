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
public class GetAllData implements Runnable{
    private DbResponce dbResponce;
    private OkHttpClient client;
    private Request request;
    private int reqCode;
    private int catID;

    public GetAllData(Object obj,int reqCode,int catID){
        dbResponce = (DbResponce) obj;
        this.reqCode = reqCode;
        this.catID = catID;
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
        String url = Utils.BASE_URL+"/getAllData?catID="+catID;

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
