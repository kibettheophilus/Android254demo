package com.theo.android254demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.theo.android254demo.databinding.FragmentEventsBinding

class EventsFragment : Fragment() {
    private lateinit var binding: FragmentEventsBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var eventsAdapter: EventsAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentEventsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.eventsRv.layoutManager = GridLayoutManager(context, 2)

        viewModel.eventsList.observe(viewLifecycleOwner) {
            eventsAdapter = EventsAdapter(it)
            binding.eventsRv.adapter = eventsAdapter
        }
    }
}
