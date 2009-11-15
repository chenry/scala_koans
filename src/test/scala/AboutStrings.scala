import org.junit._
import Assert._

@Test
class AboutStrings{

    @Test
    def testDoubleQuotedStringsAreStrings() = {
	val string = "Hello World"	
	assertTrue(string.isInstanceOf[Number])
    }

    @Test
    def testMultiLineStringsAreStrings() = {
	val string = """Hello World 
	you are 
	so green """	
	assertTrue(string.isInstanceOf[Number])
    }
}


