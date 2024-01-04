package com.example.lesson1410.data

data class Week(
    val weekNum: Int,
    val days: List<Day>
)

data class Day(
    val weekDay: WeekDay,
    val lessons: List<Lesson>
)

data class Lesson(
    val name: String,
    val lecturer: String,
    val cabinet: String,
    val lessonTime: LessonTime,
    var isCurrent: Boolean = false
)

enum class LessonTime(val startTime: String, val endTime: String) {
    LESSON1("8:00", "9:30"),
    LESSON2("9:40", "11:10"),
    LESSON3("11:20", "12:50"),
    LESSON4("13:15", "14:45"),
    LESSON5("15:00", "16:30"),
    LESSON6("16:40", "18:10"),
    LESSON7("18:20", "19:50"),
    LESSON8("19:55", "21:25")
}

enum class WeekDay(val dayName: String) {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье")
}