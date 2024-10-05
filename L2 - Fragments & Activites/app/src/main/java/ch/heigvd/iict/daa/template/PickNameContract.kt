package ch.heigvd.iict.daa.template

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class PickNameContract : ActivityResultContract<Void?, String?>() {

    override fun createIntent(context: Context, input: Void?) =
        Intent(context, EditNameActivity::class.java)

    override fun parseResult(resultCode: Int, result: Intent?): String? {
        if (resultCode != Activity.RESULT_OK) {
            return null
        }
        return result?.getStringExtra(EditNameActivity.NAME_PARAMETER_KEY)
    }
}