package example

import scala.annotation.tailrec

/**
 * 2) Необходимо реализовать метод solution,
 * который как входной параметр принимать число типа Int и
 * возвращает минимально возможное число такой же разрядности.
 * 1. Например для числа 143 функция должна вернуть 100
 * 2. Для числа 10 функция должна вернуть 10
 * 3. Для числа 1 функция должна вернуть 0
 * Допустимое значение для N от 1 до 1 000 000 000
 */
object Solution2 {

  def solution(n: Int): Int = {

    @tailrec
    def find10Pow(m: Int, p: Int = 1): Int = {
      if (m < 10) p else find10Pow(m / 10, p * 10)
    }

    if (n < 10) 0 else find10Pow(n)

  }

}
