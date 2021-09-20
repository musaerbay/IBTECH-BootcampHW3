package com.mr.bootcampweek3.base

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.mr.bootcampweek3.HomeActivity
import com.mr.bootcampweek3.R

abstract class BaseFragment : Fragment(), FragmentInterface {
    // onCreateView is put on every Fragments
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutID(), container, false)
    }

    // for show-hide Navigation
    override fun onResume() {
        super.onResume()

        val baseActivity = activity as HomeActivity
        if (isNavigationbarVisible())
            baseActivity.showNavigation()
        else
            baseActivity.hideNavigation()

    }

    // a pop-up before exiting the application
    override fun showPopUp() {
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                AlertDialog.Builder(requireContext())
                    .setTitle("UYARI !!!")                      // add Title
                    .setIcon(R.drawable.ic_action_name)        // add Icon
                    .setMessage("Uygulamadan çıkmak istediğinize emin misiniz?")
                    .setCancelable(false)
                    .setNegativeButton("Hayır", null)
                    .setPositiveButton(
                        "Evet"
                    ) { _, _ -> activity?.finish() }
                    .show()
            }
        })
    }

    abstract fun getLayoutID(): Int
}