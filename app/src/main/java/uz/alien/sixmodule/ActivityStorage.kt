package uz.alien.sixmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.alien.sixmodule.databinding.ActivityStorageBinding

class ActivityStorage : AppCompatActivity() {

    private val context = this
    private lateinit var binding: ActivityStorageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStorageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //
    }
}