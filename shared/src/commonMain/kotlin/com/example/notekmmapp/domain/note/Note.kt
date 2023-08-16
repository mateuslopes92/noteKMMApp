package com.example.notekmmapp.domain.note
import com.example.notekmmapp.presentation.BabyBlueHex
import com.example.notekmmapp.presentation.LightGreenHex
import com.example.notekmmapp.presentation.RedOrangeHex
import com.example.notekmmapp.presentation.RedPinkHex
import com.example.notekmmapp.presentation.VioletHex
import kotlinx.datetime.LocalDateTime


data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime,
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}
