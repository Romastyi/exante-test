package example

import org.scalatest.{FlatSpec, Matchers}

class Solution1Spec extends FlatSpec with Matchers {

  "Solution1.solution(...)" should "A = 10 и B = 20 => 2" in {
    Solution1.solution(10, 20) should be (2)
  }

  it should "A = 6000 и B = 7000 => 3" in {
    Solution1.solution(6000, 7000) should be (3)
  }

  it should "A = 2 и B = 1 000 000 000 => 3" in {
    Solution1.solution(2, 1000000000) should be (4)
  }

}
