package subtask5

import java.time.LocalDate
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        return when (blockB) {
            String::class -> {
                var blockC = ""
                for (x in blockA) {
                    if (x is String) {
                        blockC += x
                    }
                }
                return blockC
            }
            Int::class -> {
                var blockC = 0
                for (x in blockA) {
                    if (x is Int) {
                        blockC += x
                    }
                }
                return blockC
            }
            LocalDate::class -> {
                for (x in blockA) {
                    if (x is LocalDate) {
                        val day = x.dayOfMonth
                        val month = x.monthValue
                        val year = x.year
                        return day.toString() + "." + month + "." + year
                    }
                }
            }
            else -> return "null"
        }
    }
}
