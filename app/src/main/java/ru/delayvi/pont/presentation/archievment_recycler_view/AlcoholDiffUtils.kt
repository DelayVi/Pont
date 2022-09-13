package ru.delayvi.pont.presentation.archievment_recycler_view

import androidx.recyclerview.widget.DiffUtil
import ru.delayvi.pont.domain.entity.Alcohol

class AlcoholDiffUtils: DiffUtil.ItemCallback<Alcohol>() {
    override fun areItemsTheSame(oldItem: Alcohol, newItem: Alcohol): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Alcohol, newItem: Alcohol): Boolean {
        return oldItem == newItem
    }
}