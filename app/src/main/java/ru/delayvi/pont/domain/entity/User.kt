package ru.delayvi.pont.domain.entity

data class User(
    var nickname: String,
    var mainPhoto: String,
    var profession: String,
    var achievements: List<Alcohol>,
    var profileDescription: String,
    val id: Int = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = -1
    }
}
