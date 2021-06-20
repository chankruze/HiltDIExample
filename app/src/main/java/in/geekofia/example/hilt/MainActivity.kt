package `in`.geekofia.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var sampleString: String

    @Inject
    lateinit var sampleData: Data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // reference the text view
        val textView: TextView = findViewById(R.id.text_view)
        textView.text = "${sampleData.getName} is ${sampleData.getAge} years old!"
        Toast.makeText(this, sampleString, Toast.LENGTH_LONG).show()
    }
}