package racingcar.domain

import racingcar.util.NumberGenerator

class Cars(usernames: String) {
    private val cars: List<Car>

    init {
        val splitUsernames = usernames.split(",")
        cars = splitUsernames.map { username -> Car.init(username) }
    }

    fun race(generator: NumberGenerator) {
        for (car in cars) {
            val number = generator.generate()
            car.move(number)
        }
    }

    fun positions(): List<Position> {
        val positions: MutableList<Position> = ArrayList()
        for (car in cars) {
            positions.add(car.position())
        }
        return positions
    }
}
