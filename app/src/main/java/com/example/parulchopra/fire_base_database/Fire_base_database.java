package com.example.parulchopra.fire_base_database;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by parul chopra on 06-04-2017.
 */

public class Fire_base_database extends Application {
    @Override
        public void onCreate()
    {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
