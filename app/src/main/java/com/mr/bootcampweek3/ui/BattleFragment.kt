package com.mr.bootcampweek3.ui

import android.os.Bundle
import android.view.View
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.base.BaseFragment

class BattleFragment : BaseFragment() {


    override fun getLayoutID(): Int = R.layout.fragment_battle    // get extend from BaseFragment getLayoutID , after inflate fragment

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showPopUp()     // for show pop
    }
}