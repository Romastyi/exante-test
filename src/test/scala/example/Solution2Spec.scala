package example

import org.scalatest.{FlatSpec, Inspectors, Matchers}

class Solution2Spec extends FlatSpec with Matchers with Inspectors {

  "Solution2.solution(...)" should "1 to 9 = 0" in {
    forAll(1 to 9) { i => Solution2.solution(i) should be(0) }
  }

  it should "10 to 99 = 10" in {
    forAll(10 to 99) { i => Solution2.solution(i) should be(10) }
  }

  it should "100 to 999 = 100" in {
    forAll(100 to 999) { i => Solution2.solution(i) should be(100) }
  }

  it should "1000 to 9999 = 1000" in {
    forAll(1000 to 9999) { i => Solution2.solution(i) should be(1000) }
  }

  it should "10000 to 99999 = 10000" in {
    forAll(10000 to 99999) { i => Solution2.solution(i) should be(10000) }
  }

  it should "100000 to 999999 = 100000" in {
    forAll(100000 to 999999 by 11) { i => Solution2.solution(i) should be(100000) }
  }

  it should "1000000 to 9999999 = 1000000" in {
    forAll(1000000 to 9999999 by 111) { i => Solution2.solution(i) should be(1000000) }
  }

  it should "10000000 to 99999999 = 10000000" in {
    forAll(10000000 to 99999999 by 1111) { i => Solution2.solution(i) should be(10000000) }
  }

  it should "100000000 to 999999999 = 100000000" in {
    forAll(100000000 to 999999999 by 11111) { i => Solution2.solution(i) should be(100000000) }
  }

  it should "1000000000 = 1000000000" in {
    Solution2.solution(1000000000) should be (1000000000)
  }

}
