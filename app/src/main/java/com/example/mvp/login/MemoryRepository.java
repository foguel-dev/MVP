package com.example.mvp.login;

/**
 * Created by Yamil Vogl on 20/6/2022
 */
public class MemoryRepository implements LoginRepository{

    //En memoria
    @Override
    public void saveUser() {

    }

    @Override
    public User getUser() {
        return null;
    }
}
