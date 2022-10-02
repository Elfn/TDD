import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Project TDD
 * @Author elfof on 01/09/2022 at 11:23
 */
class MagicNumberTest {

    MagicNumber magic = null;
    Integer[] listNumber = null;
    Integer magicNumber = 0;
    HashMap<String, Object> result = null;
    boolean isTrue = false;
    boolean isFalse = false;


    @BeforeEach
    void setUp() {
         listNumber = new Integer[]{2, 5, 6, 8, 23, 10};
         magicNumber = 14;
         magic = new MagicNumber();
         result = new HashMap<String, Object>();
         result = magic.check(listNumber, magicNumber);
         isTrue = (result.get("magicNumber") == magicNumber);
         isFalse = (result.get("magicNumber") != magicNumber);
    }

    @Test
    void checkToTrue() {
         Assertions.assertTrue(isTrue);
    }

    @Test
    void checkToFalse() {
        Assertions.assertFalse(isFalse);
    }
}