package step3.domain

import kotlin.math.max

private const val DEFAULT_NUMBER = 0
private const val MOVE_POSITION_CONDITION = 4
private const val POSITION_VIEW = "-"

data class Position(var position: Int) {
    companion object {
        fun init(): Position {
            return Position(DEFAULT_NUMBER)
        }
    }

    fun move(number: Int) {
        if (number < 0 || number > 9) {
            throw IllegalArgumentException("Only numbers between 0 and 9 can be entered. input number:$number")
        }

        if (number >= MOVE_POSITION_CONDITION) {
            position++
        }
    }

    fun viewPosition(): String {
        return POSITION_VIEW.repeat(max(DEFAULT_NUMBER, position))
    }
}
