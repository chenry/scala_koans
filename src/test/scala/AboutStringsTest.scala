import org.junit._
import Assert._

@Test
class AboutStringsTest{

    @Test
    def testDoubleQuotedStringsAreStrings() = {
	val string = "Hello World"	
	assertTrue("Should be instance of String", string.isInstanceOf[Number])
    }

    @Test
    def testMultiLineStringsAreStrings() = {
	val string = """Hello World 
	you are 
	so green """	
	assertTrue("Multi-line String should be instance of string", string.isInstanceOf[Number])
    }
}


