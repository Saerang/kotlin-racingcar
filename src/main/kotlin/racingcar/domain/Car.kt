package racingcar.domain

class Car(private var position: Position, private val username: String) {
    fun move(number: Int) {
        this.position = position.move(number)
    }

    fun position(): Position {
        return this.position
    }

    fun username(): String {
        return this.username
    }

    companion object {
        fun init(username: String): Car {
            return Car(Position.init(), username)
        }
    }
}
