package com.example.lesson1410

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get
import androidx.fragment.app.Fragment
import com.example.lesson1410.databinding.FragmentRootBinding
import com.example.lesson1410.presenter.day.DayScheduleFragment
import com.example.lesson1410.presenter.week.WeekScheduleFragment
import java.util.Calendar
import java.util.Date

class RootFragment: Fragment() {

    private var binding: FragmentRootBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRootBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calendar = Calendar.getInstance()
        calendar.time = Date()

        binding?.bottomNavigationView?.setOnItemSelectedListener {
            selectTab(it.itemId, "Текщая неделя", calendar.get(Calendar.WEEK_OF_YEAR))
            true
        }

        binding?.toolbar?.setOnMenuItemClickListener {
            selectWeek(it.itemId)
            true
        }

        selectTab(R.id.navigation_day_schedule, "", 0)
    }

    private fun selectWeek(itemId: Int) {
        binding?.bottomNavigationView?.selectedItemId = R.id.navigation_week_schedule
        when(itemId) {
            R.id.first_week_schedule -> selectTab(
                R.id.navigation_week_schedule,
                "Первая неделя",
                1)
            R.id.second_week_schedule -> selectTab(
                R.id.navigation_week_schedule,
                "Вторая неделя",
                2)
        }
    }

    private fun selectTab(itemId: Int, weekTitle: String, weekNum: Int) {
        val navHostId = binding?.bottomNavHost?.id
        navHostId ?: return
        val transaction = childFragmentManager.beginTransaction()
        when(itemId) {
            R.id.navigation_week_schedule -> {
                transaction.replace(
                    navHostId,
                    WeekScheduleFragment.newInstance(weekNum)
                )
                binding?.toolbar?.title = weekTitle
            }
            R.id.navigation_day_schedule -> {
                transaction.replace(
                    navHostId,
                    DayScheduleFragment.newInstance()
                )
                binding?.toolbar?.title = "Сегодня"
            }
        }
        transaction.commit()
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            RootFragment()
    }
}