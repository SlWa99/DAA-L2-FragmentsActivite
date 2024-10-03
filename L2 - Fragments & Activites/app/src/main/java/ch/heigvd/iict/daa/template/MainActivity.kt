package ch.heigvd.iict.daa.template

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ch.heigvd.iict.daa.template.EditNameActivity.Companion.NAME_PARAMETER_KEY


class MainActivity : AppCompatActivity() {

    // region Fields
    private val TAG = "MainActivity"
    private var name = ""

    private lateinit var edit_button: Button
    private lateinit var displayed_text: TextView
    // endregion

    private val getName = registerForActivityResult(PickNameContract()) {
        // on reçoit le résultat de la seconde activité ici
        Log.d("MainActivity", "Mon nom est $it")
    }

    // region Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, R.string.log_on_create.toString())

        name = intent.getStringExtra(NAME_PARAMETER_KEY).toString()
        displayed_text = findViewById<TextView>(R.id.displayMainAvticityText)
        if (name.isEmpty()) displayed_text.text = R.string.welcome.toString()
        else displayed_text.text = name

        edit_button = findViewById<Button>(R.id.editButton)
        myButton.setOnClickListener {
            getName.launch(null)
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, R.string.log_on_start.toString())
        name = intent.getStringExtra(NAME_PARAMETER_KEY).toString()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, R.string.log_on_resume.toString())
        name = intent.getStringExtra(NAME_PARAMETER_KEY).toString()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, R.string.log_on_pause.toString())
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, R.string.log_on_stop.toString())
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, R.string.log_on_destroy.toString())
    }
    // endregion

}