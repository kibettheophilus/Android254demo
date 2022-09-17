package com.theo.android254demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.theo.android254demo.data.EventModel
import com.theo.android254demo.data.EventsRepository

class MainViewModel : ViewModel() {

    private val repository: EventsRepository = EventsRepository()

    private val _eventsList = MutableLiveData<List<EventModel>>()
    val eventsList: LiveData<List<EventModel>> get() = _eventsList

    init {
        _eventsList.value = repository.getEvents()
    }
}
