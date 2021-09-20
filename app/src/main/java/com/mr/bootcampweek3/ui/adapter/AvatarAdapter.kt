package com.mr.bootcampweek3.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.mr.bootcampweek3.R
import com.mr.bootcampweek3.ui.model.AvatarModel

class AvatarAdapter(val list: ArrayList<AvatarModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var selectedItemPos = -1
    var lastItemSelectedPos = -1

    companion object {
        const val VIEW_FIRST = 1    // text type
        const val VIEW_SECOND = 2   // image type
    }

    // Select text type or image type
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == VIEW_FIRST)
            ViewHolderText(
                LayoutInflater.from(parent.context).inflate(R.layout.row_text, parent, false)
            )
        else
            ViewHolderImage(
                LayoutInflater.from(parent.context).inflate(R.layout.row_avatar, parent, false)
            )
    }

    // Select the item to be displayed on the screen
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        if (list[position].viewType == VIEW_FIRST && holder is ViewHolderText) {
            holder.bind(position)
        } else {
            (holder as ViewHolderImage).bind(position)
            if (position == selectedItemPos) {
                holder.selectedCheckbox()
            } else
                holder.defaultCheckbox()
        }

    inner class ViewHolderText(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val textView = itemView.findViewById<TextView>(R.id.avatar_text)    // Get Text
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            textView.text = recyclerViewModel.text
        }
    }

    inner class ViewHolderImage(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val imageView = itemView.findViewById<AppCompatImageView>(R.id.avatar)  // Get İmage
        fun bind(position: Int) {
            val recyclerViewModel = list[position]
            imageView.setImageResource(recyclerViewModel.image!!)
        }

        // One checkbox for each avatar
        private val checkbox = itemView.findViewById<AppCompatImageView>(R.id.checkbox)
        fun defaultCheckbox() {
            checkbox.setImageResource(R.drawable.unchecked_checkbox)     // default checkbox : no selected
        }

        fun selectedCheckbox() {
            checkbox.setImageResource(R.drawable.checked_checkbox)        // checkbox selected
        }

        // this control so that only 1 avatar can be selected
        init {
            itemView.setOnClickListener {
                selectedItemPos = adapterPosition
                lastItemSelectedPos = if (lastItemSelectedPos == -1)
                    selectedItemPos
                else {
                    notifyItemChanged(lastItemSelectedPos)
                    selectedItemPos
                }
                notifyItemChanged(selectedItemPos)
            }
        }
    }

    override fun getItemCount(): Int = this.list.size  // get item size
    override fun getItemViewType(position: Int): Int =
        this.list[position].viewType  // get item position
}



