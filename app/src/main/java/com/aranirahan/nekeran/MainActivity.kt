package com.aranirahan.nekeran

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var currentPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_kata_pengantar.setOnClickListener(this)
        tv_sejarah.setOnClickListener(this)
        tv_petunjuk.setOnClickListener(this)
        tv_kompetensi.setOnClickListener(this)
        tv_peta_k.setOnClickListener(this)
        tv_materi.setOnClickListener(this)
        tv_lkpd.setOnClickListener(this)
        tv_rangkuman.setOnClickListener(this)
        tv_contoh_soal.setOnClickListener(this)
        tv_evaluasi.setOnClickListener(this)
        tv_daftar_pustaka.setOnClickListener(this)
        tv_glosarium.setOnClickListener(this)
        tv_profile.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            tv_kata_pengantar -> currentPage = 0
            tv_sejarah -> currentPage = 1
            tv_petunjuk -> currentPage = 2
            tv_kompetensi -> currentPage = 3
            tv_peta_k -> currentPage = 4
            tv_materi -> currentPage = 5
            tv_lkpd -> currentPage = 10
            tv_rangkuman -> currentPage = 13
            tv_contoh_soal -> currentPage = 14
            tv_evaluasi -> currentPage = 15
            tv_daftar_pustaka -> currentPage = 16
            tv_glosarium -> currentPage = 17
            tv_profile -> currentPage = 18
        }
        startActivity<NekeranActivity>("currentPage" to currentPage)
    }
}
