package com.example.testprojekt;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class TestProjektApplicationTests {

    Random r = new Random();

    @Test
    void testAddNumbers() {
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        assert(addNumbers(x,y) == x + y);
    }

    @Test
    void testSubtractNumbers() {
        int x = r.nextInt(10);
        int y = r.nextInt(10);
        assert(subtractNumbers(x,y) == x - y);
    }

    public int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public int subtractNumbers(int number1, int number2) {
        return number1 - number2;
    }

}
