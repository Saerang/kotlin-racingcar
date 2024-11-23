package racingcar.domain

class Car(private var position: Position, private var username: String) {
    fun move(number: Int) {
        this.position = position.move(number)
    }

    fun position(): Position {
        return position
    }

    companion object {
        fun init(username: String): Car {
            return Car(Position.init(), username)
        }
    }
}
