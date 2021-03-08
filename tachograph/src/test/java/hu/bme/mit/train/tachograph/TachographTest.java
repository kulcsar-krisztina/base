package hu.bme.mit.train.tachograph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TachographTest {

    Tachograph t = new Tachograph();

    @Test
    public void add() {
        t.add(6, 3);
        Assertions.assertEquals(1, t.getSize());
    }
}




