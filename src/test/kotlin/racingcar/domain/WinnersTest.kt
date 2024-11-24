package racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WinnersTest {
    @Test
    fun `우승자를 가져온다`() {
        val cars =
            Cars(
                listOf(
                    Car(Position(1), "pobi"),
                    Car(Position(2), "crong"),
                    Car(Position(3), "honux"),
                ),
            )

        val winners = Winners(cars)

        assertThat(winners.getWinnerNames()).hasSize(1).containsExactly("honux")
    }

    @Test
    fun `posoition 이 같으면 동점이다`() {
        val cars =
            Cars(
                listOf(
                    Car(Position(1), "pobi"),
                    Car(Position(3), "crong"),
                    Car(Position(3), "honux"),
                ),
            )

        val winners = Winners(cars)

        assertThat(winners.getWinnerNames()).hasSize(2).containsExactly("crong", "honux")
    }
}
