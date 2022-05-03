package com.example.desafiomultilaser.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.desafiomultilaser.R
import com.example.desafiomultilaser.databinding.ActivityMainBinding
import com.example.desafiomultilaser.presentation.util.base.BaseActivity
import com.example.desafiomultilaser.presentation.util.base.BaseViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity(override val baseViewModel: BaseViewModel) : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

//    override val baseViewModel: BaseViewModel get() = _viewModel
//        private val _viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

}