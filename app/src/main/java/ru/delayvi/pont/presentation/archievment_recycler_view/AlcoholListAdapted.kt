package ru.delayvi.pont.presentation.archievment_recycler_view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import ru.delayvi.pont.R
import ru.delayvi.pont.domain.entity.Alcohol

class AlcoholListAdapted() : ListAdapter<Alcohol, AlcoholViewHolder>(AlcoholDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlcoholViewHolder {
        var view =LayoutInflater.from(parent.context).inflate(R.layout.alcohol_item,parent,false)
        return AlcoholViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: AlcoholViewHolder, position: Int) {
        val selectedAlcohol = getItem(position)
        viewHolder.bind(selectedAlcohol)
    }
}