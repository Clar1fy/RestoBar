package com.timplifier.restobarapp.presentastion.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.restobarapp.R
import com.timplifier.restobarapp.presentastion.base.BaseFragment
import com.timplifier.restobarapp.databinding.FragmentFooBinding

class FooFragment : BaseFragment<FragmentFooBinding>(
    R.layout.fragment_foo
) {
    override val binding by viewBinding(FragmentFooBinding::bind)

    override fun initListeners() {
    }

    override fun initAdapter() {


    }

    override fun enable() {


    }

    override fun initialize() {


    }

}