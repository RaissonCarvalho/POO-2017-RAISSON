package com.example.raiss.boletimapp.application;


import com.firebase.client.Firebase;

public final class ConfiguracaoFirebase {

    private static Firebase firebase;
    private static final String URL_FIREBASE = "https://boletim-app.firebaseio.com/";

    public static Firebase getFirebase(){

        if (firebase == null)
            firebase = new Firebase(URL_FIREBASE);

        return firebase;
    }
}
