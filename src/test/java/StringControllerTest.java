import com.company.StringController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringControllerTest {

    @Test
    @DisplayName("Checking collocation")
    void testCollocations(){
        String data = "aa is the collocation";
        Boolean isCollocation = StringController.IfStringContainsWhileLetters(data);
        assertTrue(isCollocation);
    }

    @Test
    @DisplayName("Checking no collocation")
    void testNotCollocations(){
        String data = "there are no collocations";
        Boolean isCollocation = StringController.IfStringContainsWhileLetters(data);
        assertFalse(isCollocation);
    }
}
