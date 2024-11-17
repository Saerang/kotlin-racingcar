package step3

import step3.domain.Cars
import step3.domain.Position
import step3.util.DefaultNumberGenerator


fun main() {
    println("자동차 대수는 몇 대인가요?")
    val count: Int = readLine()!!.toInt()
    println("시도할 횟수는 몇 회인가요?")
    val round = readLine()!!.toInt()

    val cars = Cars(count)
    for (i in 0 until round) {
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
