package net.aichler.jupiter.tickets.n0001;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ObjectArrayArguments;

import java.util.stream.Stream;

/**
 * Describes a parameterized test where the method source is invalid and
 * therefor must be reported as failure.
 */
class Ticket0001 {

    @SuppressWarnings("unused")
    public static Stream<Arguments> data() {
        return Stream.of(
                ObjectArrayArguments.create("foo")
        );
    }

    @Nested
    class SomeParameterizedTest {

        @ParameterizedTest
        @MethodSource(names = "dataProvider")
        void testSomeData(String data) {

            System.out.println(data);
        }
    }
}
