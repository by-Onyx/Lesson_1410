package com.example.lesson1410.presenter.day

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson1410.data.DataGenerator
import com.example.lesson1410.data.Day
import com.example.lesson1410.data.Lesson
import com.example.lesson1410.data.PersonData
import com.example.lesson1410.databinding.FragmentDayScheduleBinding
import com.example.lesson1410.presenter.week.ScheduleAdapter
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.util.Calendar
import java.util.Date

class DayScheduleFragment: Fragment() {

    private var binding: FragmentDayScheduleBinding? = null
    private var adapter: ScheduleAdapter? = null
    //private var adapter: PersonsAdapter? = null
    //val persons = mutableListOf<PersonData>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calendar = Calendar.getInstance()
        calendar.time = Date()

        adapter = ScheduleAdapter()
        binding?.dayRecycler?.adapter = adapter

        val day = DataGenerator.getDayLessons((calendar.get(Calendar.WEEK_OF_YEAR) - 1) % 2,
            (calendar.get(Calendar.DAY_OF_YEAR) - 1) % 7)

        val sdf = SimpleDateFormat("HH:mm")

        //val a = sdf.parse("16:00")

        for (lesson in day.lessons){
            /*if(a.after(sdf.parse(lesson.lessonTime.startTime)) &&
                a.before(sdf.parse(lesson.lessonTime.endTime))){
                lesson.isCurrent = true
            }*/
            if(calendar.time.after(sdf.parse(lesson.lessonTime.startTime)) &&
                calendar.time.before(sdf.parse(lesson.lessonTime.endTime))){
                lesson.isCurrent = true
            }
        }

        adapter?.submitList(listOf(day))
        binding?.dayRecycler
        /*for (i in 0 .. 10) {
            persons.add(PersonData("https://thispersondoesnotexist.com/", "Arseny Kachesov", "I love java"))
        }
        adapter = PersonsAdapter()
        binding?.myFirstRecycler?.adapter = adapter

        adapter?.submitList(persons)*/
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDayScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            DayScheduleFragment()
    }
}