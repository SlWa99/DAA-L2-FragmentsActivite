package ch.heigvd.iict.daa.template

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var nameTextView: TextView
    private lateinit var editNameButton: Button

    // Contrat pour récupérer le prénom depuis EditNameActivity
    private val getName = registerForActivityResult(NameContract()) { name ->
        Log.d(TAG, "Nom reçu: $name")
        if (name != null) {
            nameTextView.text = "Bienvenue $name !"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, getString(R.string.log_on_create_enter))

        nameTextView = findViewById(R.id.nameTextView)
        editNameButton = findViewById(R.id.editNameButton)

        if (savedInstanceState != null) {
            val savedName = savedInstanceState.getString("name")
            if (savedName != null) {
                nameTextView.text = savedName
            }
        }

        // Lancer EditNameActivity via le contrat
        editNameButton.setOnClickListener {
            getName.launch(null)
        }

        Log.d(TAG, getString(R.string.log_on_create_exit))
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, getString(R.string.log_on_start))    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, getString(R.string.log_on_resume))
    }

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

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("name", nameTextView.text.toString())

        Log.d(TAG, getString(R.string.log_on_save_instance_state))
    }
}