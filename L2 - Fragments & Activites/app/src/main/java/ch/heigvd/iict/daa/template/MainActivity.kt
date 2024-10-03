package ch.heigvd.iict.daa.template

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // region Fields
    private val TAG = "MainActivity"
    // endregion

    // region Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, R.string.log_on_create.toString())
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, R.string.log_on_start.toString())
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, R.string.log_on_resume.toString())
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