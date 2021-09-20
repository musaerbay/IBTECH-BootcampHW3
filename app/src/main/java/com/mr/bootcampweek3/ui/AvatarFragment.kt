package com.mr.bootcampweek3.ui

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.base.BaseFragment
import com.mr.bootcampweek3.ui.adapter.AvatarAdapter
import com.mr.bootcampweek3.ui.model.AvatarModel

class AvatarFragment : BaseFragment() {

    override fun getLayoutID(): Int = R.layout.fragment_avatar

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // set text
        val avatarText = AvatarModel(
            "Kullanıcı adınızı oluşturun ve\n size uygun bir avatar seçin",null,
            AvatarAdapter.VIEW_FIRST
        )

        // Set text and images ArrayList
        val list = ArrayList<AvatarModel>()
        with(list)
        {
            add(avatarText)
            add(AvatarModel(null,R.drawable.avatar01,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar02,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar03,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar04,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar05,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar06,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar07,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar08,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar09,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar01,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar02,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar03,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar04,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar05,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar06,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar07,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar08,AvatarAdapter.VIEW_SECOND))
            add(AvatarModel(null,R.drawable.avatar09,AvatarAdapter.VIEW_SECOND))
        }

        // for use recyclerView adapter
        val adapter = AvatarAdapter(list)
        var recyclerView =
            activity?.findViewById(R.id.recyclerView) ?: RecyclerView(requireContext())

        val layoutManager = GridLayoutManager(requireContext(), 3)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    0 -> 3
                    else -> 1
                }
            }
        }
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        //isnpectData(list)
    }

    override fun isNavigationbarVisible() = false
}

/* private fun isnpectData(list: List<Word>) {
     if (list.isNullOrEmpty()) {
         recyclerview.gone()

     }
 }*/
