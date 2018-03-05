package com.example.raiss.boletimapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.raiss.boletimapp.R;
import com.example.raiss.boletimapp.model.Usuario;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    private EditText edEmail;
    private EditText edSenha;
    private Button btnLogin;
    private TextView tvCadastrar;
    private Usuario usuario;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        verificarUsuarioLogado();

        setupViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = new Usuario();
                usuario.setEmail(edEmail.getText().toString());
                usuario.setSenha(edSenha.getText().toString());
                logar();
            }
        });

        tvCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, CadastroActivity.class));

            }
        });
    }

    public void logar() {
        try {
            firebaseAuth.signInWithEmailAndPassword(usuario.getEmail(), usuario.getSenha())
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Log.d("loginUser:", "sucess");
                                FirebaseUser user = firebaseAuth.getCurrentUser();
                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            }else{
                                Log.d("loginUser:", "failed");
                                Toast.makeText(LoginActivity.this, "Não foi possivel fazer login", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
        }catch (IllegalArgumentException e){
            Toast.makeText(this, "Verifique os campos de Login", Toast.LENGTH_LONG).show();
        }
        finish();
    }

    private void verificarUsuarioLogado(){
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if(user != null){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }

    }

    private void setupViews() {
        edEmail = findViewById(R.id.ed_email);
        edSenha = findViewById(R.id.ed_senha);
        btnLogin = findViewById(R.id.btn_login);
        tvCadastrar = findViewById(R.id.tv_cadastro);
    }

}
