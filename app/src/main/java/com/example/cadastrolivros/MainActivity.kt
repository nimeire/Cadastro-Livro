package com.example.cadastrolivros

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtNomeAutor = findViewById<EditText>(R.id.txv_autor_livro)
        val edtNomeLivro = findViewById<EditText>(R.id.txv_nome_livro)
        val btnCadastrar = findViewById<Button>(R.id.btn_cadastar)

        btnCadastrar.setOnClickListener{
            val  NomeAutor = edtNomeAutor.text.toString()
            val NomeLivro = edtNomeLivro.text.toString()
            Toast.makeText(this, "Cadastro Feito", Toast.LENGTH_SHORT).show()







        }
    }
}