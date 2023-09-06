package Annotations;

import static org.junit.Assert.*;
import org.junit.Test;
 

public class TestCase2 {

 

    @Test
    public void givenObjectSerializedThenTrueReturned() throws IllegalArgumentException, IllegalAccessException {
        Person person = new Person("core" , "java","28");
        ObjectToJSONConverter serializer = new ObjectToJSONConverter();
        String jsonString = serializer.ConvertToJSON(person);
        assertEquals("(\"personAge\":\"28\",\"firstName\":\"Core\"," + "\"lastName\":\"Java\")", jsonString);

        }

	

 

}
