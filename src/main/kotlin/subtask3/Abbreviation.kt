package subtask3

class Abbreviation {
    fun abbreviationFromA(a: String, b: String): String {
        var j = 0
        var status = true
        for (i in 0..b.length - 1) {
            status = false
            while (a[j].toUpperCase() != b[i] && j < a.length - 1) {
                j++
            }
            if (j < a.length && a[j].toUpperCase() == b[i]) status = true
        }
        if (status) return "YES" else return "NO"
    }
}
