package racingcar.domain

import racingcar.util.NumberGenerator

class Cars(private var cars: List<Car>) {
    constructor(usernames: String) : this(usernames.split(",").map { username -> Car.init(username) })

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
}
