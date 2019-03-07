package com.aranirahan.nekeran

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_nekeran.*
import org.jetbrains.anko.toast

class NekeranActivity : AppCompatActivity() {

    private var currentPage: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nekeran)

        val intent = intent
        currentPage = intent.getIntExtra("currentPage",0)

        when (currentPage) {
            0 -> setFirstFragment(KataPengantarFragment(), R.string.kata_pengantar)
            1 -> setFirstFragment(SejarahNekeranFragment(), R.string.sejarah_nekeran)
            2 -> setFirstFragment(PetunjukPenggunaaanFragment(), R.string.petunjuk_penggunaan)
            3 -> setFirstFragment(KompetensiFragment(), R.string.kompetensi)
            4 -> setFirstFragment(PetaKonsepFragment(), R.string.peta_konsep)
            5 -> setFirstFragment(Materi1MomentumFragment(), R.string.materi)
            6 -> setFirstFragment(Materi2ImpulsFragment(), R.string.materi)
            7 -> setFirstFragment(Materi3ImpulsMomentumFragment(), R.string.materi)
            8 -> setFirstFragment(Materi4HukumKekekalanFragment(), R.string.materi)
            9 -> setFirstFragment(Materi5TumbukanFragment(), R.string.materi)
            10 -> setFirstFragment(Lkpd1Fragment(), R.string.lkpd)
            11 -> setFirstFragment(Lkpd2Fragment(), R.string.lkpd)
            12 -> setFirstFragment(Lkpd3Fragment(), R.string.lkpd)
            13 -> setFirstFragment(RangkumanFragment(), R.string.rangkuman)
            14 -> setFirstFragment(ContohSoalFragment(), R.string.contoh_soal)
            15 -> setFirstFragment(EvaluasiFragment(), R.string.evaluasi)
            16 -> setFirstFragment(DaftarPustakaFragment(), R.string.daftar_pustaka)
            17 -> setFirstFragment(GloasriumFragment(), R.string.glosarium)
            18 -> setFirstFragment(ProfileFragment(), R.string.profile)
        }

        cv_previous.setOnClickListener {
            when (currentPage) {
                1 -> setFragment(KataPengantarFragment(), R.string.kata_pengantar, false)
                2 -> setFragment(SejarahNekeranFragment(), R.string.sejarah_nekeran, false)
                3 -> setFragment(PetunjukPenggunaaanFragment(), R.string.sejarah_nekeran, false)
                4 -> setFragment(KompetensiFragment(), R.string.kompetensi, false)
                5 -> setFragment(PetaKonsepFragment(), R.string.peta_konsep, false)
                6 -> setFragment(Materi1MomentumFragment(), R.string.materi, false)
                7 -> setFragment(Materi2ImpulsFragment(), R.string.materi, false)
                8 -> setFragment(Materi3ImpulsMomentumFragment(), R.string.materi, false)
                9 -> setFragment(Materi4HukumKekekalanFragment(), R.string.materi, false)
                10 -> setFragment(Materi5TumbukanFragment(), R.string.materi, false)
                11 -> setFragment(Lkpd1Fragment(), R.string.lkpd, false)
                12 -> setFragment(Lkpd2Fragment(), R.string.lkpd, false)
                13 -> setFragment(Lkpd3Fragment(), R.string.lkpd, false)
                14 -> setFragment(RangkumanFragment(), R.string.rangkuman, false)
                15 -> setFragment(ContohSoalFragment(), R.string.contoh_soal, false)
                16 -> setFragment(EvaluasiFragment(), R.string.evaluasi, false)
                17 -> setFragment(DaftarPustakaFragment(), R.string.daftar_pustaka, false)
                18 -> setFragment(GloasriumFragment(), R.string.glosarium, false)
                19 -> setFragment(ProfileFragment(), R.string.profile, false)
                else -> toast("Ini halaman pertama")
            }
        }

        cv_next.setOnClickListener {
            when (currentPage) {
                0 -> setFragment(SejarahNekeranFragment(), R.string.sejarah_nekeran)
                1 -> setFragment(PetunjukPenggunaaanFragment(), R.string.sejarah_nekeran)
                2 -> setFragment(KompetensiFragment(), R.string.kompetensi)
                3 -> setFragment(PetaKonsepFragment(), R.string.peta_konsep)
                4 -> setFragment(Materi1MomentumFragment(), R.string.materi)
                5 -> setFragment(Materi2ImpulsFragment(), R.string.materi)
                6 -> setFragment(Materi3ImpulsMomentumFragment(), R.string.materi)
                7 -> setFragment(Materi4HukumKekekalanFragment(), R.string.materi)
                8 -> setFragment(Materi5TumbukanFragment(), R.string.materi)
                9 -> setFragment(Lkpd1Fragment(), R.string.lkpd)
                10 -> setFragment(Lkpd2Fragment(), R.string.lkpd)
                11 -> setFragment(Lkpd3Fragment(), R.string.lkpd)
                12 -> setFragment(RangkumanFragment(), R.string.rangkuman)
                13 -> setFragment(ContohSoalFragment(), R.string.contoh_soal)
                14 -> setFragment(EvaluasiFragment(), R.string.evaluasi)
                15 -> setFragment(DaftarPustakaFragment(), R.string.daftar_pustaka)
                16 -> setFragment(GloasriumFragment(), R.string.glosarium)
                17 -> setFragment(ProfileFragment(), R.string.profile)
                else -> toast("Ini halaman terakhir")
            }
        }

        cv_home.setOnClickListener { finish() }
    }

    private fun setFragment(fragment: Fragment, titleId: Int, nextType: Boolean = true) {

        val previousPage =
            if (currentPage != MIN_PAGE) currentPage - 1
            else currentPage

        val nextPage =
            if (currentPage != MAX_PAGE) currentPage + 1
            else currentPage

        this.currentPage =
            if (nextType) nextPage
            else previousPage

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        tv_title.text = getString(titleId)
        tv_page.text = (currentPage + 1).toString()
    }

    private fun setFirstFragment(fragment: Fragment, titleId: Int) {

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commit()

        tv_title.text = getString(titleId)
        tv_page.text = (currentPage + 1).toString()
    }

    companion object {
        const val MIN_PAGE = 0
        const val MAX_PAGE = 18
    }
}
