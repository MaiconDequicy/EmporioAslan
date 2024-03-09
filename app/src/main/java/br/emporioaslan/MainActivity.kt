package br.emporioaslan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicializa o handler
        val handler = Handler()

        //chama a funcao de exibir tela de login após 2s
        handler.postDelayed(
            {
                mostrarLogin()
            }, 2000)
    }

    private fun mostrarLogin()
    {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
        finish()
    }
}