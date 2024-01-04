package com.example.lesson1410.presenter.week

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson1410.data.DataGenerator
import com.example.lesson1410.databinding.FragmentWeekScheduleBinding
import java.util.Calendar
import java.util.Date

class WeekScheduleFragment(val weekNum: Int): Fragment() {

    private var binding: FragmentWeekScheduleBinding? = null
    private var adapter: ScheduleAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calendar = Calendar.getInstance()
        calendar.time = Date()

        adapter = ScheduleAdapter()
        binding?.weekRecycler?.adapter = adapter

        val week = DataGenerator.getSchedule()

        adapter?.submitList(week[(weekNum - 1) % 2].days)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWeekScheduleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    companion object {
        @JvmStatic
        fun newInstance(weekNum: Int) =
            WeekScheduleFragment(weekNum)
    }
}