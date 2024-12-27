package com.example.homework_3_8

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView

class ListFragment : Fragment(R.layout.fragment_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        recyclerView.layoutManager = GridLayoutManager(context, 2)

        val lottieFiles = listOf(
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
            R.raw.rainbow_parrot,
        )

        recyclerView.adapter = ItemAdapter(lottieFiles) { lottieFile ->
            findNavController().navigate(R.id.action_listFragment_to_detailFragment)
        }
    }



}