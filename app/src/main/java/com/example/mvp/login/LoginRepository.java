package com.example.mvp.login;

/**
 * Created by Yamil Vogl on 20/6/2022
 */
public interface LoginRepository {

    void saveUser();

    User getUser();

}
