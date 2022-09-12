package ru.delayvi.pont.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import ru.delayvi.pont.databinding.UserFragmentBinding
import ru.delayvi.pont.domain.entity.Alcohol
import ru.delayvi.pont.presentation.archievment_recycler_view.AlcoholListAdapted

class UserFragment: Fragment() {

    private lateinit var binding: UserFragmentBinding

    val alcoholListAdapted = AlcoholListAdapted()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = UserFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Picasso.get()
            .load("https://sun9-88.userapi.com/impf/c625229/v625229097/2c4d/C6AFbZ4xluQ.jpg?size=640x640&quality=96&sign=3bc892436a029279133ecc9b192f134b&type=album")
            .into(binding.ivMainPhoto)
        var alcoList = mutableListOf<Alcohol>()
        for (i in 0 until 10){
            var alco = Alcohol("Paulaner", "String", i)
            alcoList.add(alco)
        }
        binding.rvAlcohol.adapter = alcoholListAdapted
        binding.rvAlcohol.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        alcoholListAdapted.submitList(alcoList)
    }
}