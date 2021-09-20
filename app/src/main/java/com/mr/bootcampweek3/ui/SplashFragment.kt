package com.mr.bootcampweek3.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.utils.navigateToNextFragment

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToNextFragment(R.id.action_splashFragment_to_fragment1)
        }, 3000)
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }
}

/*   // Activity deki fun ulaşıp kullanmak için.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireActivity() as HomeActivity).hideNavigation()
    }
*/

/*  // 3 sn gözüksün Sonra Bar gizlensin

 override fun getLayoutID(): Int = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        prepareView()
            Handler(Looper.getMainLooper()).postDelayed({
                navigateToNextFragment(R.id.action_splashFragment_to_fragment1)

            },3000)

        }

    private fun prepareView() {
        (requireActivity() as HomeActivity).hideNavigation()
    }
    override fun isNavigationbarVisible() = false
 */


/*
 //Waiting 3 sec. for Splash Activity
    private val DELAY: Long=3*1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Timer Thread
        Timer().schedule(object : TimerTask() {
            override fun run() {
                //Called MainActivity
                startActivity<MainActivity>()
                //destroyed splash activitiy
                finish()
            }
        }, DELAY)
    }
 */