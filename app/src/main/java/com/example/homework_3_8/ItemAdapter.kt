package com.example.homework_3_8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class ItemAdapter(
    private val lottieFiles: List<Int>,
    private val onClick: (Int) -> Unit
) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val lottieView: LottieAnimationView = view.findViewById(R.id.lottieAnimation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lottie, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val lottieFile = lottieFiles[position]
        holder.lottieView.setAnimation(lottieFile)
        holder.lottieView.playAnimation()
        holder.itemView.setOnClickListener {
            onClick(lottieFile)
        }
    }

    override fun getItemCount(): Int = lottieFiles.size
}