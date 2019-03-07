package com.aranirahan.nekeran

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class DaftarPustakaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_daftar_pustaka, container, false)
    }

    companion object {
        fun newInstance() = DaftarPustakaFragment()
    }
}
//"Kata Pengantar",
//"Sejarah Nekeran",
//"Petunjuk Penggunaan",
//"Kompetensi",
//"Peta Konsep",
//"Materi",
//"LKPD",
//"Evaluasi",
//"Daftar Pustaka",
//"Glosarium",
//"Profil"