package com.example.courtcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    private val _scoreTeamA = MutableLiveData<Int>()
    val scoreTeamA: LiveData<Int>
        get() = _scoreTeamA

    private val _scoreTeamB = MutableLiveData<Int>()
    val scoreTeamB: LiveData<Int>
        get() = _scoreTeamB

    init {
        _scoreTeamA.value = 0
        _scoreTeamB.value = 0
    }


    fun addScoreForTeamA(score: Int) {
        _scoreTeamA.value = _scoreTeamA.value?.plus(score)
    }

    fun addScoreForTeamB(score: Int) {
        _scoreTeamB.value = _scoreTeamB.value?.plus(score)
    }

    fun resetButton(){
        _scoreTeamA.value = 0
        _scoreTeamB.value = 0
    }
}