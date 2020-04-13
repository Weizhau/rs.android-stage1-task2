package subtask2

class TimeConverter {

    // TODO: Complete the following function
    fun toTextFormat(hour: String, minute: String): String {
        val output = StringBuilder()
        val bind = HashMap<String, String>();
        bind.put("01", "one");
        bind.put("02", "two");
        bind.put("03", "three");
        bind.put("04", "four");
        bind.put("05", "five");
        bind.put("06", "six");
        bind.put("07", "seven");
        bind.put("08", "eight");
        bind.put("09", "nine");
        bind.put("1", "one");
        bind.put("2", "two");
        bind.put("3", "three");
        bind.put("4", "four");
        bind.put("5", "five");
        bind.put("6", "six");
        bind.put("7", "seven");
        bind.put("8", "eight");
        bind.put("9", "nine");
        bind.put("10", "ten");
        bind.put("11", "eleven");
        bind.put("12", "twelve");
        bind.put("13", "thirteen");
        bind.put("14", "fourteen");
        bind.put("15", "fifteen");
        bind.put("16", "sixteen");
        bind.put("17", "seventeen");
        bind.put("18", "eighteen");
        bind.put("19", "nineteen");
        bind.put("20", "twenty");
        bind.put("21", "twenty one");
        bind.put("22", "twenty two");
        bind.put("23", "twenty three");
        bind.put("24", "twenty four");
        bind.put("25", "twenty five");
        bind.put("26", "twenty six");
        bind.put("27", "twenty seven");
        bind.put("28", "twenty eight");
        bind.put("29", "twenty nine");


        when (minute) {
            "00" -> {
                output.append(bind.get(hour))
                output.append(" o' clock")
            }
            "15" -> {
                output.append("quarter past ")
                output.append(bind.get(hour))

            }
            "30" -> {
                output.append("half past ")
                output.append(bind.get(hour))
            }
            "45" -> {
                output.append("quarter to ")
                output.append(bind.get((Integer.parseInt(hour) + 1).toString()))
            }
            else -> {
                if (Integer.parseInt(minute) < 60) {
                    if (Integer.parseInt(minute) < 30) {
                        output.append(bind.get(minute))
                        output.append(" minutes past ")
                        output.append(bind.get(hour))
                    } else {
                        output.append(bind.get((60 - Integer.parseInt(minute)).toString()))
                        output.append(" minutes to ")
                        output.append(bind.get((Integer.parseInt(hour) + 1).toString()))
                    }
                }
            }
        }
        return output.toString();
    }
}
