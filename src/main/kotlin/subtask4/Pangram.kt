package subtask4

class Pangram {

    // TODO: Complete the following function
    fun getResult(inputString: String): String {
        val output = StringBuilder()
        if (isPangram(inputString.toLowerCase())) {
            val arr = inputString.replace("\n","").replace("\\s+"," ").split(" ").toTypedArray()
            sortByVowels(arr)
            for (x in arr) {
                if (countVowels(x) > -1) {
                    output.append(countVowels(x))
                }
                output.append(capitalizeVowels(x.toCharArray()))
                output.append(" ")
            }
            return output.toString().trim()
        } else {
            val arr = inputString.replace("\n","").replace("\\s+"," ").split(" ").toTypedArray()
            sortByConsonants(arr)
            for (x in arr) {
                if (countConsonants(x) > -1) {
                    output.append(countConsonants(x))
                }
                output.append(capitalizeConsonants(x.toCharArray()))
                output.append(" ")
            }
            return output.toString().trim()
        }
    }

    fun isPangram(str: String): Boolean {
        var ch = 'a'
        var status = true
        while (ch <= 'z') {
            if (!str.contains(ch)) {
                status = false
            }
            ch = ch.inc()
        }

        return status
    }

    fun sortByVowels(a: Array<String>) {
        var sorted = false
        var temp: String
        while (!sorted) {
            sorted = true;
            for (i in 0..a.size - 2) {
                if (countVowels(a[i]) > countVowels(a[i + 1])) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    fun sortByConsonants(a: Array<String>) {
        var sorted = false
        var temp: String
        while (!sorted) {
            sorted = true;
            for (i in 0..a.size - 2) {
                if (countConsonants(a[i]) > countConsonants(a[i + 1])) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    fun countVowels(str: String): Int {
        val fuck = "aeiouyAEIOUY";
        var count = 0
        if (str.length > 0) {
            for (i in 0..str.length - 1) {
                if (fuck.indexOf(str[i]) >= 0) {
                    count++
                }
            }
        } else count = -1

        return count
    }

    fun countConsonants(str: String): Int {
        val fuck = "bcdsfghjklmnpqrstvwxzBCDSFGHJKLMNPQRSTVWXZ"
        var count = 0
        if (str.length > 0) {
            for (i in 0..str.length - 1) {

                if (fuck.indexOf(str[i]) >= 0) {
                    count++
                }

            }
        } else count = -1

        return count
    }

    fun capitalizeVowels(arr: CharArray): String {
        val fuck = "aeiouyAEIOUY"
        var output: String = ""
        for (a in arr) {

            if (fuck.indexOf(a) >= 0) {
                output += a.toUpperCase()
            } else output += a
        }
        return output
    }

    fun capitalizeConsonants(arr: CharArray): String {
        val fuck = "bcdsfghjklmnpqrstvwxzBCDSFGHJKLMNPQRSTVWXZ"
        var output: String = ""
        for (a in arr) {
            if (fuck.indexOf(a) >= 0) {

                output += a.toUpperCase()
            } else output += a
        }
        return output
    }
}
