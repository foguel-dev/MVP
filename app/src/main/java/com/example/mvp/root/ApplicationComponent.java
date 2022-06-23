package com.example.mvp.root;

import com.example.mvp.login.LoginActivity;

import javax.inject.Singleton;
import dagger.Component;

/**
 * Created by Yamil Vogl on 15/6/2022
 */

//Referencia entre activities, fragments, services con dagger
@Singleton
@Component(modules = ApplicationModule.class) //depende de ApplicationModule
public interface ApplicationComponent {
    //actividades, servicios o fragmentos deben ser declararse con metodos de inyeccion

    void inject(LoginActivity target);

}
