package org.github.scala

import org.junit._
import Assert._

@Test
class AboutAsserts{

    @Test
    def testAssertTrue() = assertTrue(false)

    @Test
    def testAssertFalse() = assertFalse(true)

    @Test
    def testAssertFalseWithMessage() = assertFalse("should be false", true)

    @Test
    def testAssertEquals() = {
	
	val num1 = 5
	val num2 = num1 + 1
	assertEquals(num1,num2)
    }
}


