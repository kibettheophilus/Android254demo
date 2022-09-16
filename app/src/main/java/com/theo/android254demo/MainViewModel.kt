package com.theo.android254demo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _eventsList = MutableLiveData<List<EventModel>>()
    val eventsList: LiveData<List<EventModel>> get() = _eventsList

    init {
        _eventsList.value = listOf(
            EventModel(
                "Android 254 January Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 February Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 Match Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 April Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 May Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 June Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            ),
            EventModel(
                "Android 254 July Meetup",
                "Hey, devs!We hope that you are all pumped up for this month's meetup! We have three sessions lined up for you"
            )
        )
    }
}
