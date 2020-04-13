package subtask6

class Fibonacci {

    // TODO: Complete the following function
    fun productFibonacciSequenceFor(n: Int): IntArray {
        var n1 = 0
        var n2 = 1
        var temp: Int
        var output = IntArray(3)
        while (n1 * n2 < n) {
            temp = n2
            n2 = n2 + n1;
            n1 = temp
        }

        if (n1 * n2 == n) {
            output.set(0, n1)
            output.set(1, n2)
            output.set(2, 1)
        } else {
            output.set(0, n1)
            output.set(1, n2)
            output.set(2, 0)
        }
        return output
    }
}
