fun main(args: Array<String>) {
    
    println("Введите день недели (1-7):")
    val weekSchedule = when (readLine()?.toIntOrNull()) {
        1 -> OneWeek.MONDAY
        2 -> OneWeek.TUESDAY
        3 -> OneWeek.WEDNESDAY
        4 -> OneWeek.THURSDAY
        5 -> OneWeek.FRIDAY
        6 -> OneWeek.SATURDAY
        7 -> OneWeek.SUNDAY
        else -> null
    }
    if (weekSchedule != null) {
        println(weekSchedule.name + ":")
        when (weekSchedule) {
            OneWeek.MONDAY -> {
                println("08:00 Работа")
                println("11:00 Тренировка")
            }

            OneWeek.TUESDAY -> {
                println("09:00 Встерча")
                println("12:00 Обед")
            }

            OneWeek.WEDNESDAY -> {
                println("10:00 Всать")
                println("13:00 Пойти(необезательно)")
            }

            OneWeek.THURSDAY -> {
                println("11:00 Спать")
                println("14:00 Дальше спать")
            }

            OneWeek.FRIDAY -> {
                println("12:00 Гулять")
                println("15:00 Завести собаку")
            }

            OneWeek.SATURDAY -> {
                println("13:00 Домой")
                println("16:00 Завести кота")
            }

            OneWeek.SUNDAY -> {
                println("14:00 Пойти куда-то")
                println("17:00 Бегать")
            }
        }
    } else {
        println("Не правильный ввод. Введите число от 1 до 7")
    }
}