package com.example.appfilmes

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appfilmes.adapter.AdapterFilmes
import com.example.appfilmes.databinding.ActivityMainBinding
import com.example.appfilmes.model.Filme

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapterFilmes : AdapterFilmes
    // listaFilmes é uma lista mutável que armazenará os objetos do tipo Filme.
    private val listaFilmes : MutableList<Filme> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        val recyclerViewFilmes = binding.recyclerViewFilmes
        recyclerViewFilmes.layoutManager = LinearLayoutManager(this)
        recyclerViewFilmes.setHasFixedSize(true)
        adapterFilmes = AdapterFilmes(this, listaFilmes)
        recyclerViewFilmes.adapter = adapterFilmes
        filmes()

    }

    private fun filmes() {
        val filme1 = Filme("Os Vingadores")
        listaFilmes.add(filme1)

        val filme2 = Filme("Os Incriveis")
        listaFilmes.add(filme2)

        val filme3 = Filme("Corra")
        listaFilmes.add(filme3)

        val filme4 = Filme("Barbie")
        listaFilmes.add(filme4)

        val filme5 = Filme("Avatar")
        listaFilmes.add(filme5)

        val filme6 = Filme("Interestelar")
        listaFilmes.add(filme6)

        val filme7 = Filme("TED")
        listaFilmes.add(filme7)

        val filme8 = Filme("Homem-Aranha")
        listaFilmes.add(filme8)

        val filme9 = Filme("Se beber não case")
        listaFilmes.add(filme9)

        val filme10 = Filme("Se beber não case 2")
        listaFilmes.add(filme10)

        val filme11 = Filme("Se beber não case 3")
        listaFilmes.add(filme11)

        val filme12 = Filme("Matrix")
        listaFilmes.add(filme12)

        val filme13 = Filme("O Senhor dos Anéis")
        listaFilmes.add(filme13)

        val filme14 = Filme("Harry Potter")
        listaFilmes.add(filme14)

        val filme15 = Filme("Toy Story")
        listaFilmes.add(filme15)

        val filme16 = Filme("O Rei Leão")
        listaFilmes.add(filme16)

        val filme17 = Filme("Jurassic Park")
        listaFilmes.add(filme17)

        val filme18 = Filme("Star Wars")
        listaFilmes.add(filme18)

        val filme19 = Filme("Indiana Jones")
        listaFilmes.add(filme19)

        val filme20 = Filme("Piratas do Caribe")
        listaFilmes.add(filme20)

        val filme21 = Filme("Forrest Gump")
        listaFilmes.add(filme21)

        val filme22 = Filme("Gladiador")
        listaFilmes.add(filme22)

        val filme23 = Filme("Titanic")
        listaFilmes.add(filme23)

        val filme24 = Filme("Clube da Luta")
        listaFilmes.add(filme24)

        val filme25 = Filme("O Iluminado")
        listaFilmes.add(filme25)

        val filme26 = Filme("Pulp Fiction")
        listaFilmes.add(filme26)

        val filme27 = Filme("O Poderoso Chefão")
        listaFilmes.add(filme27)

        val filme28 = Filme("A Origem")
        listaFilmes.add(filme28)

        val filme29 = Filme("O Lobo de Wall Street")
        listaFilmes.add(filme29)

        val filme30 = Filme("Coringa")
        listaFilmes.add(filme30)




    }
}