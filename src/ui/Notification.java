/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Youtube
 */
public class Notification {
 
    public static String makeRequest() throws JSONException {
        HttpURLConnection urlConnection;
        JSONObject json = new JSONObject();
        JSONObject info = new JSONObject();
        info.put("title", "Notification Title");   // Notification title
        info.put("body", "Notification bodyqw"); // Notification body
        info.put("sound", "mySound"); // Notification sound
        //info.put("image", "https://cdn1.iconfinder.com/data/iconsets/previews/medium-2x/pixel-art-small.png");
        json.put("notification", info);
        json.put("to","/topics/all");
        
        
        JSONObject gg = new JSONObject();
        gg.put("hello", "hello12");
        
        json.put("data",gg);
        //Log.e("deviceidkey==> ",id+"");
        //Log.e("jsonn==> ",json.toString());
        String data = json.toString();
        System.out.println(data);
        String result = null;
        try {
            //String serverKey = "AAAAHKi0-7Y:APA91bFVovp2ecckRE4B3EvDY9_7n144NiKvZNbNTJMulZ7xS4Mgval6d5Jmumx3BI6z-NLLZGZaU7O8YNghVBJ-e_Kk8xiwgp_0J8r126SrEHVaY2Erfh3ElghpSKbLP7yKUDqH4ME2";
            
            String serverKey = "AAAAAEup6RI:APA91bE63ii1EC6bf27ddPpQG1dqTiwFMoK3EuxwRadKe63EMUViR1JnePhXBv45ZJFjt7R3aE-8dzuiuXvdO2AV68K4z-FvBpi3tt_emmzYvc57N_kW1ZwPz9isL9g-hRZIEuSzcBlt";
            //Connect
            urlConnection = (HttpURLConnection) ((new URL("https://fcm.googleapis.com/fcm/send").openConnection()));
            urlConnection.setDoOutput(true);
            urlConnection.setRequestProperty("Content-Type", "application/json");
            urlConnection.setRequestProperty("Authorization", "key="+serverKey);
            urlConnection.setRequestMethod("POST");
            urlConnection.connect();

            //Write
            OutputStream outputStream = urlConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
            writer.write(data);
            writer.close();
            outputStream.close();

            //Read
            BufferedReader bufferedReader = 
                    new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));

            String line = null;
            StringBuilder sb = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }

            bufferedReader.close();
            result = sb.toString();
            System.out.println(result);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
        return result;
    }
}
