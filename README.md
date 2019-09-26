### Solution1

Необходимо реализовать метод solution, который на вход получает два интеджера A и B и возвращает максимальное количество повторяющихся квадратных корней, которые могут выполнены с использованием чисел, которые находятся внутри интервала [A,B] (включая оба конца). Извлечение квадратного корня продолжается до тех пор, пока результат целочисленный.

1. Например для значений A = 10 и B = 20 функция должна вернуть 2, т.к. начиная с числа 16 могут быть выполнены 2 операции извлечения квадратного корня с 16 -> 4 -> 2.
2. Например для значений A = 6000 и B = 7000 функция должна вернуть 3, т.к. 6561 -> 81 -> 9 -> 3

Необходимо реализовать эффективный алгоритм имея ввиду следующие ограничения:
1. A и B - это Int в интервале [2, 1 000 000 000]
2. A <= B

### Solution2

Необходимо реализовать метод solution, который как входной параметр принимат число типа Int и возвращает минимально возможное число такой же разрядности.
1. Например для числа 143 функция должна вернуть 100
2. Для числа 10 функция должна вернуть 10
3. Для числа 1 функция должна вернуть 0
Допустимое значение для N от 1 до 1 000 000 000