package racingcar

import racingcar.domain.Cars
import racingcar.domain.Winners
import racingcar.util.DefaultNumberGenerator

fun main() {
    println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
    val usernames: String = readln()
    println("시도할 횟수는 몇 회인가요?")
    val round: Int = readln().toInt()

    val cars = Cars.usernames(usernames)
    repeat(round) {
        cars.race(DefaultNumberGenerator())
        gameResult(cars)
    }

    gameWinner(cars)
}

private fun gameResult(cars: Cars) {
    cars.cars().forEach {
        println(it.username() + " : " + it.position().viewPosition())
    }
    println()
}

private fun gameWinner(cars: Cars) {
    val winners = Winners(cars)
    val winnersName = winners.getWinnerNames().joinToString(",")
    println(winnersName + "가 최종 우승했습니다.")
}
