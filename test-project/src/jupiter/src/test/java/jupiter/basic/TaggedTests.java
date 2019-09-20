package jupiter.basic;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaggedTests {

    @Test
    @Tag("smoke")
    @Tag("development")
    @Tag("integration")
    public void test0() {
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    @Tag("development")
    @Tag("integration")
    public void test1() {
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    @Tag("production")
    @Tag("integration")
    public void test2() {
        assertTrue(true);
    }

    @Test
    @Tag("full")
    @Tag("production")
    @Tag("integration")
    public void test3() {
        assertTrue(true);
    }
}