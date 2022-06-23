package com.example.mvp.root;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yamil Vogl on 15/6/2022
 */
@Module
public class ApplicationModule {
    //Variable privada que gestiona todas las dependencias
    private Application application;

    //Inicializamos, se la asignamos a application que llega por parametro
    public ApplicationModule(Application application){
        this.application = application;
    }
    //Metodos que expongan un valor de retorno seran anotados:
    //Instancia que solo se debe crear una vez, simplifica codigo
    @Provides
    @Singleton
    //Provides porque tiene un valor de retorno contexto, singlenton porque debe existir una vez
    public Context provideContext(){
        return application;
    }

}
