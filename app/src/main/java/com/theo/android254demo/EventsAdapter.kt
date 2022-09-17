package com.theo.android254demo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.theo.android254demo.data.EventModel
import com.theo.android254demo.databinding.ItemEventBinding

class EventsAdapter(private val events: List<EventModel>) :
    RecyclerView.Adapter<EventsAdapter.EventsViewHolder>() {

    inner class EventsViewHolder(val binding: ItemEventBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        val binding = ItemEventBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventsViewHolder(binding)
    }

    override fun getItemCount(): Int = events.size

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val event = events[position]

        holder.binding.eventTitle.text = event.title
        holder.binding.eventDesc.text = event.description
    }
}
