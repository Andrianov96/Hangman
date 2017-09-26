import collection.mutable.Stack
import org.scalatest._
import org.junit.Assert._

class Mytest extends FlatSpec {


  it should "return ****" in {
    assertEquals("****", Main.curWord("hate", Set()))
  }

  it should "return " in {
    val n = Set() ++ "a"
    assertEquals(n, Main.addChar(Set(), "a"))
  }
}