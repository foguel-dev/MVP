package com.example.mvp.login;

/**
 * Created by Yamil Vogl on 20/6/2022
 */

//Interfaz para contener la informacion del Modelo Vista Presentador
    //interfaz es pasiva solo sunistra datos al presenter
public interface LoginActivityMVP {
    interface Model{
        void createUser(String firstName, String lastName);
        //devuelve user
        User getUser();
    }
    interface View{
        String getFirstName();
        String getLastName();

        void showUserNotAvailable();
        void showError();
        void showUserSaved();
        
        void setFirstName(String firstName);
        void setLastName(String lastName);
    }
    //interactua con view
    interface Presenter{
        //a que vista gobierna
        void setView(LoginActivityMVP.View view);
        //indica al presenter que alguien a pulsado un boton
        void loginButtonClicked();
        //cargar el user desde el model
        void getCurrentUser();
    }
}
