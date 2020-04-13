package subtask1


import kotlin.text.StringBuilder

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        val bind = HashMap<String, String>()
        bind.put("1", " января, ")
        bind.put("2", " февраля, ")
        bind.put("3", " марта, ")
        bind.put("4", " апреля, ")
        bind.put("5", " мая, ")
        bind.put("6", " июня, ")
        bind.put("7", " июля, ")
        bind.put("8", " августа, ")
        bind.put("9", " сентября, ")
        bind.put("10", " октября, ")
        bind.put("11", " ноября, ")
        bind.put("12", " декабря, ")

        val output = StringBuilder()
        var executable = false

        if (Integer.parseInt(month) < 13) {
            if (Integer.parseInt(month) < 8) {
                when (Integer.parseInt(month) % 2) {
                    1 -> {
                        if ( Integer.parseInt(day) < 32) {
                            executable = true
                        }
                    }

                    0 -> {
                        if (Integer.parseInt(day) < 31) {
                            executable = true
                            if (month.equals("2") && Integer.parseInt(day) > 28) {
                                executable = false
                            }
                        }
                    }
                }
            } else {
                when (Integer.parseInt(month) % 2) {
                    0 -> {
                        if ( Integer.parseInt(day) < 32) {
                            executable = true
                        }
                    }

                    1 -> {
                        if (Integer.parseInt(day) < 31) {
                            executable = true
                            if (month.equals("2") && Integer.parseInt(day) > 28) {
                                executable = false
                            }
                        }
                    }
                }
            }

            if (executable) {
                val a = (14 - Integer.parseInt(month)) / 12
                val newYear = Integer.parseInt(year) - a
                val newMonth = Integer.parseInt(month) + 12 * a - 2

                val dayOfWeek = (Integer.parseInt(day)
                        + (31 * newMonth) / 12
                        + newYear
                        + newYear / 4
                        - newYear / 100
                        + newYear / 400
                        ) % 7

                output.append(day)
                output.append(bind.get(month))

                when (dayOfWeek) {
                    0 -> {
                        output.append("воскресенье")
                    }
                    1 -> {
                        output.append("понедельник")
                    }
                    2 -> {
                        output.append("вторник")
                    }
                    3 -> {
                        output.append("среда")
                    }
                    4 -> {
                        output.append("четверг")
                    }
                    5 -> {
                        output.append("пятница")
                    }
                    6 -> {
                        output.append("суббота")
                    }
                }
            } else {
                output.append("Такого дня не существует")
            }

        } else {
            output.append("Такого дня не существует")
        }

        return output.toString()
    }
}
