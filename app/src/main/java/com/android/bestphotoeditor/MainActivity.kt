package com.android.bestphotoeditor

import android.content.Intent
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.burhanrashid52.photoeditor.EditImageActivity
import com.burhanrashid52.photoeditor.Keys
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEditor).setOnClickListener {
            val path = Environment.getExternalStorageDirectory()
                .toString() + File.separator + "NikafarineganCo"

            val intent = Intent(this@MainActivity, EditImageActivity::class.java)
            val bundle = Bundle()
            bundle.putString(Keys.KEY_PATH_FILE, path)
            startActivity(intent)
        }
    }
}