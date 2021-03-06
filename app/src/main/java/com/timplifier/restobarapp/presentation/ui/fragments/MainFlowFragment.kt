package com.timplifier.restobarapp.presentation.ui.fragments

import androidx.navigation.NavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.restobarapp.R
import com.timplifier.restobarapp.databinding.FragmentMainFlowBinding
import com.timplifier.restobarapp.presentation.base.BaseFlowFragment

class MainFlowFragment : BaseFlowFragment(
    R.layout.fragment_main_flow, R.id.nav_host_fragment_main
) {
    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.bottomNavigation.setupWithNavController(navController)
    }

}