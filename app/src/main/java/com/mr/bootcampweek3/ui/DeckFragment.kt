package com.mr.bootcampweek3.ui

import android.os.Bundle
import android.view.View
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.base.BaseFragment

class DeckFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_deck

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showPopUp()
    }
}

/*
       //parse bundle data
        val stringValue = arguments?.getString("myStringValue")
        val integerValue = arguments?.getInt("myIntegerValue", 100)
        myTextView.text = "$stringValue $integerValue"
 */