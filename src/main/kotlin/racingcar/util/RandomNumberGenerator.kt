package racingcar.util

import kotlin.random.Random

private const val RANDOM_MAX_NUMBER = 10

class RandomNumberGenerator : NumberGenerator {
    override fun generate(): Int {
        return Random.nextInt(RANDOM_MAX_NUMBER)
    }
}