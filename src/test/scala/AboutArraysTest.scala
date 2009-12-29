import org.junit._
import Assert._

@Test
class AboutArraysTest{

    @Test
    def testCreateArraysInstanceOf() = {
	var a : Array[String] = new Array(0)
	assertEquals("Should be instance of Array", a.isInstanceOf[String])
    }

    @Test
    def testCreateArraysEmptySize() = {
	var a : Array[String] = new Array(0)
	assertEquals("Should be size of 0", 1, a.size)
    }

    @Test
    def testCreateArraysEmptyLength() = {
	var a : Array[String] = new Array(0)
	assertEquals("Should be size of 0", 1, a.length)
    }

    @Test
    def testAddValueToArray() = {
	var a : Array[String] = new Array(2)
	a(0) = "1"
	assertEquals("Should be 1", "2", a(0))
    }
}
