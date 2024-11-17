package step3.domain

class Car(private val position: Position) {
    fun move(number: Int) {
        position.move(number)
    }

    fun position(): Position {
        return position
    }

    companion object {
        fun init(): Car {
            return Car(Position.init())
        }
    }
}
