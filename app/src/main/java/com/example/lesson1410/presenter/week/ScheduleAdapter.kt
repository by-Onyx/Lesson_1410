package com.example.lesson1410.presenter.week

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.data.Day
import com.example.lesson1410.databinding.DayScheduleItemBinding
import com.example.lesson1410.presenter.day.DayScheduleAdapter

class ScheduleAdapter: RecyclerView.Adapter<ScheduleAdapter.WeekScheduleViewHolder>() {
    private val list = mutableListOf<Day>()

    class WeekScheduleViewHolder(
        private val binding: DayScheduleItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Day) = with(binding) {
            dayName.text = data.weekDay.dayName
            if(data.lessons.isNotEmpty()){
                dayLessonsInfo.text = "${data.lessons.size} пары " +
                        "с ${data.lessons[0].lessonTime.startTime} " +
                        "до ${data.lessons[data.lessons.size - 1].lessonTime.endTime}"
            }
            else{
                dayLessonsInfo.text = "В этот день пар нет :)"
            }

            val adapter = DayScheduleAdapter()
            dayRecycler.adapter = adapter

            adapter.submitList(data.lessons)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeekScheduleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DayScheduleItemBinding.inflate(inflater, parent, false)
        return WeekScheduleViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: WeekScheduleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<Day>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}