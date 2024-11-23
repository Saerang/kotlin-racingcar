package racingcar

import racingcar.domain.Cars
import racingcar.domain.Position
import racingcar.util.DefaultNumberGenerator

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val usernames: String = readln()
    println("시도할 횟수는 몇 회인가요?")
    val round: Int = readln().toInt()

    val cars = Cars(usernames)
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
