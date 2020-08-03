import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MommifierTest {
    @Test
    void should_return_none_when_given_none() {
        //given
        String stringOfNone="";
        //when
        Mommifier mommifier=new Mommifier();
        String result = mommifier.convertString(stringOfNone);
        //then
        String expected = "";
        assertEquals(result, expected);
    }
    @Test
    void should_throw_exception_when_given_null() {
        //given
        String stringOfNull=null;
        //when
        Mommifier mommifier=new Mommifier();
        //then
        assertThrows(RuntimeException.class,  ()-> {
            mommifier.convertString(stringOfNull);
        });
    }
}
