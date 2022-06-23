package com.example.mvp.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvp.R;
import com.example.mvp.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View {
    //inyectamos el presentador a la vista
    @Inject
    LoginActivityMVP.Presenter presenter;

    EditText firstName, lastName;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //indicamos al presentador que se usara como elemento de vista
        //injectamos dagger al conjunto de componentes
        ((App) getApplication()).getComponent().inject(this);

        firstName = findViewById(R.id.edt_firstName);
        lastName = findViewById(R.id.edt_lastName);
        btnLogin = findViewById(R.id.btn_login);

    }

    //notificamos al presenter que se siguera usando esta vista, si solo la usamos en el oncrete dejaria de tener constancia
    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
    }

    @Override
    public String getFirstName() {
        return this.firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return this.lastName.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Toast.makeText(this, "Error, el usuario no esta disponible", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Los campos no pueden estar vacios", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showUserSaved() {
        Toast.makeText(this, "Usuario ha sido guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName.setText(lastName);
    }
}