import collection.mutable.Stack
import org.scalatest._
import org.junit.Assert._

class Mytest extends FlatSpec {


  it should "return ****" in {
    assertEquals("****", Main.CurWord("hate", Set()))
  }

}