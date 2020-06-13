package com.olgavino.android;

import android.app.Activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CallingServlet implements Runnable {
        Activity activity;
        String link;
        String result;
        public CallingServlet(Activity activity, String urlLink)
        {
            this.activity = activity;
            this.link = urlLink;
        }
        @Override
        public void run()
        {
            try{
                URL url = new URL(link);
                URLConnection conn = url.openConnection();
                InputStream is = conn.getInputStream();
                final StringBuffer output = new StringBuffer("");
                BufferedReader buffer = new BufferedReader(new InputStreamReader(is));
                String s = "";
                while ((s = buffer.readLine()) != null){
                    output.append(s);
                }
                result = output.toString();
            }catch (MalformedURLException e){
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }

            activity.runOnUiThread(new Runnable()
            {
                @Override
                public void run()
                {
                    MainActivity.display.setText(result);
                }
            });
        }
    }
