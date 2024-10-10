package ch.heigvd.iict.daa.template

import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract
import androidx.appcompat.app.AppCompatActivity

class NameContract : ActivityResultContract<Void?, String?>() {

    override fun createIntent(context: Context, input: Void?): Intent {
        return Intent(context, EditNameActivity::class.java)
    }

    override fun parseResult(resultCode: Int, intent: Intent?): String? {
        return if (resultCode == AppCompatActivity.RESULT_OK) {
            intent?.getStringExtra("name")
        } else {
            null
        }
    }
}