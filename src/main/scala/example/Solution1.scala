package example

import scala.annotation.tailrec

/**
 * 1)Необходимо реализовать метод solution,
 * который на вход получает два интеджера A и B и
 * возвращает максимальное количество повторяющихся квадратных корней,
 * которые могут выполнены с использованием чисел,
 * которые находятся внутри интервала [A,B] (включая оба конца).
 * Извлечение квадратного корня продолжается до тех пор, пока результат целочисленный.
 *
 * 1. Например для значений A = 10 и B = 20 функция должна вернуть 2,
 * т.к. начиная с числа 16 могут быть выполнены 2 операции извлечения квадратного корня с 16 -> 4 -> 2.
 * 2. Например для значений A = 6000 и B = 7000 функция должна вернуть 3,
 * т.к. 6561 -> 81 -> 9 -> 3
 *
 * Необходимо реализовать эффективный алгоритм имея ввиду следующие ограничения:
 * 1. A и B - это Int в интервале [2, 1 000 000 000]
 * 2. A <= B
 */
object Solution1 {

  // Naive implementation
  @tailrec
  private def findMaxIntSqrtCount(n: Int, acc: Int = 0): Int = {
    if (n > 0) {
      val s = BigDecimal(math.sqrt(n))
      if (s.isValidInt) {
        findMaxIntSqrtCount(s.toIntExact, acc + 1)
      } else acc
    } else 0
  }

  def solution(a: Int, b: Int): Int = {

    // Последовательность полных квадратов от A до B
    @tailrec
    def inner(i: Int, prev: Int, maxDepth: Int): Int = {
      val next = prev + i
      if (next > b) maxDepth
      else if (next >= a) inner(i + 2, next, findMaxIntSqrtCount(next) max maxDepth)
      else inner(i + 2, next, maxDepth)
    }

    inner(3, 1, 0)

  }

}
