package net.tehranit.es1;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;


public class G extends Application {

    public static Context        context;
    public static LayoutInflater inflater;


    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

}
