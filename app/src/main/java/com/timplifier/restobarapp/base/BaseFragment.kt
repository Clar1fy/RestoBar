package com.timplifier.restobarapp.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding>(@LayoutRes layoutId: Int) : Fragment(layoutId) {
    protected abstract val binding: ViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initAdapter()
        initialize()
        enable()
    }


    protected open fun initListeners() {

    }

    protected open fun initAdapter() {

    }

    protected open fun initialize() {

    }

    protected open fun enable() {

    }

}