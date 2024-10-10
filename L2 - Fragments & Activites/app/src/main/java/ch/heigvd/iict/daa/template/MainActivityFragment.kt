package ch.heigvd.iict.daa.template

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import ch.heigvd.iict.and.labo2.fragments.ColorFragment
import ch.heigvd.iict.and.labo2.fragments.CounterFragment

class MainActivityFragment : AppCompatActivity() {

    private val TAG = "MainActivityFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)
        Log.d(TAG, getString(R.string.log_on_create_enter))

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
        Log.d(TAG, getString(R.string.log_on_create_exit))
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, getString(R.string.log_on_start))    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, getString(R.string.log_on_resume))    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, getString(R.string.log_on_pause))    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, getString(R.string.log_on_stop))    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, getString(R.string.log_on_destroy))
    }
}