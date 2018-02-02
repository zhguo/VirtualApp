package io.virtualapp.delegate;

import android.app.Activity;
import android.app.Application;
import android.app.NativeActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import com.lody.virtual.client.hook.delegate.ComponentDelegate;
import com.lody.virtual.helper.utils.Reflect;

import java.io.File;


public class MyComponentDelegate implements ComponentDelegate {
    Activity mProcessTopActivity;
    @Override
    public void beforeApplicationCreate(Application application) {

    }

    @Override
    public void afterApplicationCreate(Application application) {
        //TODO: listen activity lifecycle
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {
                mProcessTopActivity = activity;
            }

            @Override
            public void onActivityPaused(Activity activity) {
                if (mProcessTopActivity == activity) {
                    mProcessTopActivity = null;
                }
            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }

    @Override
    public void beforeActivityCreate(Activity activity) {

    }

    @Override
    public void beforeActivityResume(Activity activity) {

    }

    @Override
    public void beforeActivityPause(Activity activity) {

    }

    @Override
    public void beforeActivityDestroy(Activity activity) {

    }

    @Override
    public void afterActivityCreate(Activity activity) {

    }

    @Override
    public void afterActivityResume(Activity activity) {

    }

    @Override
    public void afterActivityPause(Activity activity) {

    }

    @Override
    public void afterActivityDestroy(Activity activity) {

    }

    @Override
    public void onSendBroadcast(Intent intent) {

    }
}
