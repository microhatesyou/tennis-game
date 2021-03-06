package org.acme;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

    @Test
    @DisplayName("verify constructor saves name correctly")
    void constructor() {
        // given
        String name = "hello world";
        // when
        Player actual = new Player(name);
        //then
        assertThat(actual.getName()).isEqualTo(name);
        assertThat(actual.getPoints()).isZero();
    }

    @Test
    @DisplayName("verify addPoint increment point by one")
    void addPoints() {
        // given
        Player actual = new Player("hello world");
        // when
        actual.addPoint();
        //then
        assertThat(actual.getPoints()).isOne();
    }
}
