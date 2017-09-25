import collection.mutable.Stack
import org.scalatest._
import org.junit.Assert._

class Mytest extends FlatSpec {
  "Program" should "return right " in {

    assertEquals("Right", Main.tes_fun(true))
  }


}