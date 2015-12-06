package net.andrewgee.travistest

import org.scalatest._

class AdderSpec extends WordSpec with Matchers {
  "Adding" should {
    "return 1 for 0,1" in {
      Adder.add(0,1) shouldBe 1
    }

    "return 2 for 1.1" in {
      Adder.add(1,1) shouldBe 2
    }
  }
}
