package racingcar.domain

import racingcar.util.NumberGenerator

private const val USERNAME_SPLIT_CONDITION = ","

class Cars(private val cars: List<Car>) {
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

    fun cars(): List<Car> {
        return cars
    }

    companion object {
        fun usernames(usernames: String): Cars {
            return Cars(usernames.split(USERNAME_SPLIT_CONDITION).map { username -> Car.init(username) })
        }
    }
}
