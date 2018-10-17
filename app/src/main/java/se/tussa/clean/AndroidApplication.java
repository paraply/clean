package se.tussa.clean;

import android.app.Application;

import timber.log.Timber;

public class AndroidApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        Timber.d("✅ Starting app");
    }
}
