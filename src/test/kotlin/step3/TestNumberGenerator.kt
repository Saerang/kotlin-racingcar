package step3

import step3.util.NumberGenerator

class TestNumberGenerator(private val number: Int) : NumberGenerator {
    override fun generate(): Int {
        return number
    }
}
