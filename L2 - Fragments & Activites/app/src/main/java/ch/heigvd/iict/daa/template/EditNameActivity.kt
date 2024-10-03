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

    // region Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_name_activity)
        Log.d(TAG, R.string.log_on_create.toString())

        val textField = findViewById<EditText>(R.id.nameEditText)
        val button = findViewById<Button>(R.id.saveNameButton)

        button.setOnClickListener {
            val fieldValue = textField.text.toString()
            val data = Intent()
            data.putExtra(NAME_PARAMETER_KEY, fieldValue)
            setResult(RESULT_OK, data)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, R.string.log_on_start.toString())
        // TODO
        name = intent.getStringExtra(NAME_PARAMETER_KEY).toString()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, R.string.log_on_resume.toString())
        // TODO
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

    companion object {
        val NAME_PARAMETER_KEY = "NAME_KEY"
    }
}