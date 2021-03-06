package org.acme;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class SCORETest {

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, -1, Integer.MAX_VALUE})
    void fromPointsAnyOther(int number) {
        assertThatThrownBy(() -> SCORE.fromPoints(number))
                .isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("cant calculate point directly for value " + number);
    }

    @Test
    void fromPointsZero() {
        // when
        SCORE score = SCORE.fromPoints(0);
        // then
        Assertions.assertThat(score).isEqualTo(SCORE.LOW);
    }

    @Test
    void fromPointsOne() {
        // when
        SCORE score = SCORE.fromPoints(1);
        // then
        Assertions.assertThat(score).isEqualTo(SCORE.FIFTEEN);
    }

    @Test
    void fromPointsTwo() {
        // when
        SCORE score = SCORE.fromPoints(2);
        // then
        Assertions.assertThat(score).isEqualTo(SCORE.THIRTY);
    }

    @Test
    void fromPointsThree() {
        // when
        SCORE score = SCORE.fromPoints(3);
        // then
        Assertions.assertThat(score).isEqualTo(SCORE.FORTY);
    }
}
