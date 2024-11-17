package step3.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `자동차는 4이상의 숫자일 때 이동한다`() {
        val car = Car.init()

        car.move(4)

        assertThat(car.position()).isEqualTo(Position(1))
    }

    @Test
    fun `자동차는 4미만의 숫자일 때 이동하지 않는다`() {
        val car = Car.init()

        car.move(3)

        assertThat(car.position()).isEqualTo(Position(0))
    }
}
