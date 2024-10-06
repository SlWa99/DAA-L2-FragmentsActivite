package ch.heigvd.iict.daa.template

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ch.heigvd.iict.and.labo2.fragments.ColorFragment
import ch.heigvd.iict.and.labo2.fragments.CounterFragment

class MainActivityFragment1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

        // Vérifie si l'activité a déjà été créée (pour ne pas recréer les fragments après une rotation par exemple)
        if (savedInstanceState == null) {
            // Ajout du fragment CounterFragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerCounter, CounterFragment())
                .commit()

            // Ajout du fragment ColorFragment
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerColor, ColorFragment())
                .commit()
        }
    }
}