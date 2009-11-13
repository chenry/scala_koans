package org.github.scala

import org.junit._
import Assert._

@Test
class AppTest {

    @Test
    def testAssertTrue() = assertTrue(false)

    @Test
    def testAssertFalse() = assertFalse(true)

}


