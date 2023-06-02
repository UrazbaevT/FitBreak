package com.example.fitbreak.core.network.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.realestateagency1.core.network.ui.BaseViewModel

abstract class BaseFragment<VM : BaseViewModel, VB : ViewBinding>: Fragment() {

    protected lateinit var binding: VB
    protected abstract val viewModel: VM

    protected abstract fun inflateViewBinding(inflater: LayoutInflater): VB

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = inflateViewBinding(inflater)
        return binding.root

        checkInternet()
        initViewModel()
        initView()
        initListener()

    }

    open fun initView() {}
    open fun initListener() {}
    open fun checkInternet() {}
    open fun initViewModel() {}

}