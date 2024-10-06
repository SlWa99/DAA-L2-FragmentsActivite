package ch.heigvd.iict.daa.template

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class EditNameActivity : AppCompatActivity() {

    // region Fields
    private val TAG = "EditNameActivity"
    // endregion

    // region Methods
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, getString(R.string.log_on_create))
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