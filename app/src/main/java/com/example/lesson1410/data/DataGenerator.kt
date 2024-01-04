package com.example.lesson1410.data

import android.util.Log
import java.time.DayOfWeek

object DataGenerator {
    fun getSchedule(): List<Week>{
        return listOf(
            Week(
                weekNum = 1,
                days = listOf(
                    Day(
                        weekDay = WeekDay.MONDAY,
                        lessons = listOf()
                    ),
                    Day(
                        weekDay = WeekDay.TUESDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Экономика программной инженерии (лек.)",
                                lecturer = "Ткач Е.С.",
                                cabinet = "221 (2 корпус)",
                                lessonTime = LessonTime.LESSON5
                            ),
                            Lesson(
                                name = "Базы и хранилища данных (лек.)",
                                lecturer = "Барабанщиков И.В.",
                                cabinet = "413",
                                lessonTime = LessonTime.LESSON7
                            ),
                            Lesson(
                                name = "Базы и хранилища данных (лек.)",
                                lecturer = "Барабанщиков И.В.",
                                cabinet = "413",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.WEDNESDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Управление ИТ-проектами и жизненным циклом ПО (лек.)",
                                lecturer = "-",
                                cabinet = "А-15",
                                lessonTime = LessonTime.LESSON7
                            ),
                            Lesson(
                                name = "Управление ИТ-проектами и жизненным циклом ПО (пр.)",
                                lecturer = "-",
                                cabinet = "А-15",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.THURSDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Анализ данных (пр.)",
                                lecturer = "Алюков С.В.",
                                cabinet = "132А",
                                lessonTime = LessonTime.LESSON5
                            ),
                            Lesson(
                                name = "Анализ данных (лек.)",
                                lecturer = "Алюков С.В.",
                                cabinet = "А-13",
                                lessonTime = LessonTime.LESSON6
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.FRIDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Разработка интернет-приложений (пр.)",
                                lecturer = "Павличенков Е.А.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.SATURDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Технологии прикладного программирования ",
                                lecturer = "Веригин Н.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON2
                            ),
                            Lesson(
                                name = "Технологии прикладного программирования ",
                                lecturer = "Веригин Н.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON3
                            ),
                            Lesson(
                                name = "Технологии прикладного программирования ",
                                lecturer = "Веригин Н.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON4
                            ),
                            Lesson(
                                name = "Технологии прикладного программирования ",
                                lecturer = "Веригин Н.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON5
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.SUNDAY,
                        lessons = listOf()
                    )
                )
            ),
            Week(
                weekNum = 2,
                days = listOf(
                    Day(
                        weekDay = WeekDay.MONDAY,
                        lessons = listOf()
                    ),
                    Day(
                        weekDay = WeekDay.TUESDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Экономика программной инженерии (пр.)",
                                lecturer = "Ткач Е.С.",
                                cabinet = "304 (2 корпус)",
                                lessonTime = LessonTime.LESSON6
                            ),
                            Lesson(
                                name = "Экономика программной инженерии (пр.)",
                                lecturer = "Ткач Е.С.",
                                cabinet = "304 (2 корпус)",
                                lessonTime = LessonTime.LESSON7
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.WEDNESDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Управление ИТ-проектами и жизненным циклом ПО (лек.)",
                                lecturer = "-",
                                cabinet = "А-15",
                                lessonTime = LessonTime.LESSON7
                            ),
                            Lesson(
                                name = "Управление ИТ-проектами и жизненным циклом ПО (пр.)",
                                lecturer = "-",
                                cabinet = "А-15",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.THURSDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Базы и хранилища данных (пр.)",
                                lecturer = "Барабанщиков И.В.",
                                cabinet = "132А",
                                lessonTime = LessonTime.LESSON7
                            ),Lesson(
                                name = "Анализ данных (пр.)",
                                lecturer = "Алюков С.В.",
                                cabinet = "132Б",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.FRIDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Разработка интернет-приложений (лек.)",
                                lecturer = "Павличенков Е.А.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON7
                            ),
                            Lesson(
                                name = "Разработка интернет-приложений (пр.)",
                                lecturer = "Павличенков Е.А.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON8
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.SATURDAY,
                        lessons = listOf(
                            Lesson(
                                name = "Тестирование программного обеспечения (пр.)",
                                lecturer = "Булавин Р.С.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON2
                            ),
                            Lesson(
                                name = "Тестирование программного обеспечения (пр.)",
                                lecturer = "Булавин Р.С.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON3
                            ),
                            Lesson(
                                name = "Базы и хранилища данных (пр.)",
                                lecturer = "Барабанщиков И.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON4
                            ),
                            Lesson(
                                name = "Базы и хранилища данных (пр.)",
                                lecturer = "Барабанщиков И.В.",
                                cabinet = "132",
                                lessonTime = LessonTime.LESSON5
                            )
                        )
                    ),
                    Day(
                        weekDay = WeekDay.SUNDAY,
                        lessons = listOf()
                    )
                )
            ),
        )
    }

    fun getDayLessons(weekNum: Int, dayNum: Int): Day{
        val schedule = getSchedule()
        return schedule[weekNum].days[dayNum]
    }
}