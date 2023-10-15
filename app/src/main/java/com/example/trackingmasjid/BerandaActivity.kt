package com.example.trackingmasjid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.res.TypedArray
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.trackingmasjid.Adapter.RvMasjidAdapter
import com.example.trackingmasjid.databinding.ActivityBerandaBinding
import com.example.trackingmasjid.Model.RvMasjidModel

class BerandaActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBerandaBinding
    private lateinit var adapterKeren:RvMasjidAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBerandaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setRvAdapter()
    }

    private fun init() {
        binding.rvExample.layoutManager = LinearLayoutManager(this@BerandaActivity, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun setRvAdapter() {

        val dataList:MutableList<RvMasjidModel> = mutableListOf()

        namemj().forEachIndexed { index, name ->
            dataList.add(RvMasjidModel(imageMasjid().get(index),name,jarak()[index]))
        }

        Log.d("ISI DATANYA ",dataList.toString())
        adapterKeren = RvMasjidAdapter(dataList)
        binding.rvExample.adapter = adapterKeren

    }

    private fun namemj():Array<String> = resources.getStringArray(R.array.data_masjid)
    private fun jarak():Array<String> = resources.getStringArray(R.array.data_lokasi)

    private fun imageMasjid():List<Int> = listOf(
        R.drawable.masjid_istiqlal,
        R.drawable.masjid_an_nur,
        R.drawable.masjid_baiturrahman,
        R.drawable.masjid_ics,
        R.drawable.masjid_agung_jateng
    )
}