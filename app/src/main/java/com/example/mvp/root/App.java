package com.example.mvp.root;
import android.app.Application;

import com.example.mvp.login.LoginModule;

/**
 * Created by Yamil Vogl on 15/6/2022
 */
//donde vive dagger(durante ciclo de vida de la app)
public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        //inicializamos dagger
       component = DaggerApplicationComponent.builder()
               .loginModule(new LoginModule())
               .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}

//No es la inicializacion tipica para ir a una activity, pasamos por un intermerdiaro App
