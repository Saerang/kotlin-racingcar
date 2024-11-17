package step3.util

import kotlin.random.Random

class DefaultNumberGenerator : NumberGenerator {
    override fun generator(): Int {
        return Random.nextInt(10)
    }
}
