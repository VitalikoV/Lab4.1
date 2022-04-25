import com.company.StringController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringControllerTest {

    @Test
    @DisplayName("Checking collocation")
    void testCollocations(){
        StringController controller = new StringController();
        String data = "aa is the collocation";
        Boolean isCollocation = controller.IfStringContainsWhileLetters(data);
        assertTrue(isCollocation);
    }

    @Test
    @DisplayName("Checking no collocation")
    void testNotCollocations(){
        StringController controller = new StringController();
        String data = "there are no collocations";
        Boolean isCollocation = controller.IfStringContainsWhileLetters(data);
        assertFalse(isCollocation);
    }
}
