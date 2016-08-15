package stoddart.michael.com.volleysingletonexample;

import android.app.Application;

import stoddart.michael.com.volleysingletonexample.networking.NetworkManager;

/**
 * Created by MichaelApposing on 15/08/2016.
 */
public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        NetworkManager.getInstance(this);
    }
}
