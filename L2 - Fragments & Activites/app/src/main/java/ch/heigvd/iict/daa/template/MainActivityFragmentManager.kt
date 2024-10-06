package ch.heigvd.iict.daa.template

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivityFragmentManager : AppCompatActivity() {

    private val TAG = "MainActivityFragmentManager"

    // Variable pour suivre l'étape courante
    private var currentStep = 1
    private val totalSteps = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment_manipulation3)  // Utilise le layout défini

        // Au démarrage, afficher le premier fragment si aucune sauvegarde d'état n'existe
        if (savedInstanceState == null) {
            showStepFragment(currentStep)
        }

        // Récupérer les boutons et définir leurs comportements
        findViewById<Button>(R.id.button_previous).setOnClickListener {
            if (currentStep > 1) {
                currentStep--  // Aller à l'étape précédente
                showStepFragment(currentStep)
            } else {
                finish()  // Fermer l'activité si aucune étape précédente
            }
        }

        findViewById<Button>(R.id.button_close).setOnClickListener {
            finish()  // Fermer l'activité
        }

        findViewById<Button>(R.id.button_next).setOnClickListener {
            if (currentStep < totalSteps) {
                currentStep++  // Aller à l'étape suivante
                showStepFragment(currentStep)
            }
        }
    }

    // Fonction pour afficher le fragment correspondant à l'étape actuelle
    private fun showStepFragment(stepNumber: Int) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, StepFragment.newInstance(stepNumber))  // Remplacer le fragment actuel par le nouveau
            .commit()
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