package racingcar

import racingcar.util.NumberGenerator

class TestNumberGenerator(private val number: Int) : NumberGenerator {
    override fun generate(): Int {
        return number
    }
}
