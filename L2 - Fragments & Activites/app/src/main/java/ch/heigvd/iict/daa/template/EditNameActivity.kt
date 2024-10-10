package ch.heigvd.iict.daa.template

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class EditNameActivity : AppCompatActivity() {

    // region Fields
    private val TAG = "EditNameActivity"
    // endregion

        private lateinit var editTextName: EditText
        private lateinit var saveButton: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.edit_name_activity)
            Log.d(TAG, getString(R.string.log_on_create_enter))

            editTextName = findViewById(R.id.nameEditText)
            saveButton = findViewById(R.id.saveNameButton)

            // Sauvegarder et renvoyer le prénom à MainActivity
            saveButton.setOnClickListener {

                val name = editTextName.text.toString()
                val resultIntent = Intent().apply {
                    putExtra("name", name)
                }
                setResult(RESULT_OK, resultIntent)
                finish()  // Fermer EditNameActivity
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
    // endregion

}