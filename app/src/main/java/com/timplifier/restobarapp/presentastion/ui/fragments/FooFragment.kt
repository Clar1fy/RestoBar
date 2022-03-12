package com.timplifier.restobarapp.presentastion.ui.fragments

import android.system.Os.bind
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.restobarapp.R
import com.timplifier.restobarapp.base.BaseFragment
import com.timplifier.restobarapp.databinding.FragmentFooBinding

class FooFragment : BaseFragment<com.timplifier.restobarapp.databinding.FragmentFooBinding>(
    R.layout.fragment_foo
) {
    override val binding by viewBinding(FragmentFooBinding::bind)

}