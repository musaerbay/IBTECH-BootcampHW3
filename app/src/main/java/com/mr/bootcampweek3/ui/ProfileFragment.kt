package com.mr.bootcampweek3.ui

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : BaseFragment() {
    override fun getLayoutID(): Int = R.layout.fragment_profile

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showPopUp()
        profile_edit_btn.setOnClickListener {
            findNavController().navigate(R.id.action_fragment3_to_fragment4)
        }
    }
}