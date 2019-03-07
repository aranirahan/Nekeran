package com.aranirahan.nekeran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Materi3ImpulsMomentumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_materi_impuls_momentum, container, false)
    }
    companion object {
        fun newInstance() = Materi1MomentumFragment()
    }
}
