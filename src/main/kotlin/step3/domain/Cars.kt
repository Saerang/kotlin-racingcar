package step3.domain

import step3.util.NumberGenerator

class Cars(users: Int) {
    private val cars: MutableList<Car> = ArrayList()

    init {
        repeat(users) {
            cars.add(Car.init())
        }
    }

    fun race(generator: NumberGenerator) {
        for (car in cars) {
            val number = generator.generator()
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
