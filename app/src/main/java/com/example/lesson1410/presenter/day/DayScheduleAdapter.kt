package com.example.lesson1410.presenter.day

import android.content.Context
import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson1410.data.Lesson
import com.example.lesson1410.databinding.LessonItemBinding

class DayScheduleAdapter: RecyclerView.Adapter<DayScheduleAdapter.DayScheduleViewHolder>() {
    private val list = mutableListOf<Lesson>()

    class DayScheduleViewHolder(
        private val binding: LessonItemBinding
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Lesson) = with(binding) {
            startTime.text = data.lessonTime.startTime
            endTime.text = data.lessonTime.endTime
            lessonName.text = data.name
            lessonCabinet.text = "Аудитория: ${data.cabinet}"
            lessonLecturer.text = "Преподаватель: ${data.lecturer}"

            if (data.isCurrent){
                lessonId.setBackgroundColor(Color.GRAY)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayScheduleViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = LessonItemBinding.inflate(inflater, parent, false)
        return DayScheduleViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: DayScheduleViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<Lesson>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}