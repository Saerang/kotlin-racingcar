package racingcar

import racingcar.domain.Cars
import racingcar.domain.Position
import racingcar.util.DefaultNumberGenerator

fun main() {
    println("자동차 대수는 몇 대인가요?")
    val count: Int = readln().toInt()
    println("시도할 횟수는 몇 회인가요?")
    val round: Int = readln().toInt()

    val cars = Cars(count)
    repeat(round) {
        cars.race(DefaultNumberGenerator())
        gameResult(cars.positions())
    }
}

fun gameResult(positions: List<Position>) {
    positions.forEach { position ->
        println(position.viewPosition())
    }
    println()
}