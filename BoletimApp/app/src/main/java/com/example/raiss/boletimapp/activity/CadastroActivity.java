package com.example.raiss.boletimapp.activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.raiss.boletimapp.R;
import com.example.raiss.boletimapp.application.ConfiguracaoFirebase;
import com.example.raiss.boletimapp.model.Usuario;
import com.firebase.client.Firebase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class CadastroActivity extends AppCompatActivity {

    private EditText edNome;
    private EditText edEmail;
    private EditText edSenha;
    private Button btnCadastro;
    private Usuario usuario;

    private FirebaseAuth firebaseAuth;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        setupViews();

        incializarFirebase();

        btnCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    usuario = new Usuario();
                    usuario.setNome(edNome.getText().toString());
                    usuario.setEmail(edEmail.getText().toString());
                    usuario.setSenha(edSenha.getText().toString());
                    usuario.setId(UUID.randomUUID().toString());
                    cadastrarUsuario();
            }
        });

    }

    private void cadastrarUsuario() {
        try {
            firebaseAuth = FirebaseAuth.getInstance();
            firebaseAuth.createUserWithEmailAndPassword(usuario.getEmail(), usuario.getSenha())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Log.d("createUser", "createUserWithEmail: success");
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                databaseReference.child("usuarios").child(usuario.getId()).setValue(usuario);
                                logar();

                            }else{
                                Log.w("createUser", "createUserWithEmail: failure", task.getException());
                                Toast.makeText(CadastroActivity.this, "Falha ao cadastrar", Toast.LENGTH_LONG);
                            }
                        }
                    });
        }catch (IllegalArgumentException e){
            Toast.makeText(this, "Verifique os campos de cadastro", Toast.LENGTH_SHORT).show();
        }

    }

    private void logar() {
        try {
            firebaseAuth.signInWithEmailAndPassword(usuario.getEmail(), usuario.getSenha())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Log.d("loginUser:", "sucess");
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                startActivity(new Intent(CadastroActivity.this, MainActivity.class));

                            }else{
                                Log.d("loginUser:", "failed");
                                Toast.makeText(CadastroActivity.this, "Não foi possivel fazer login", Toast.LENGTH_LONG)
                                        .show();
                            }
                        }
                    });
        }catch (IllegalArgumentException e){
            Toast.makeText(this, "Preencha todos os campos de login", Toast.LENGTH_LONG).show();
        }
        finish();
    }

    private void incializarFirebase(){
        FirebaseApp.initializeApp(CadastroActivity.this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void setupViews() {

        edEmail = findViewById(R.id.ed_cadastro_email);
        edNome = findViewById(R.id.ed_cadastro_nome);
        edSenha = findViewById(R.id.ed_cadastro_senha);
        btnCadastro = findViewById(R.id.btn_cadastro);

    }
}
