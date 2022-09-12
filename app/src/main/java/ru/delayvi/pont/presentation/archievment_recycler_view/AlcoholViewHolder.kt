package ru.delayvi.pont.presentation.archievment_recycler_view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import ru.delayvi.pont.databinding.AlcoholItemBinding
import ru.delayvi.pont.domain.entity.Alcohol

class AlcoholViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
private val binding = AlcoholItemBinding.bind(itemView)
    fun bind(alcohol: Alcohol) = with(binding){
        tvNameAlc.text = alcohol.name
    }
}