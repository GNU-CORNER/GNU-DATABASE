package com.example.corner_library.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    private val _currentPage = MutableLiveData<Int>()

    val currentPage: LiveData<Int> = _currentPage

    init {
        _currentPage.value = 1
    }

    fun nextPage() {
        if (_currentPage.value!! < NUM_PAGES) _currentPage.value = _currentPage.value?.inc()
    }

    fun prevPage() {
        if (_currentPage.value!! > 1) _currentPage.value = _currentPage.value?.dec()
    }

    companion object {
        const val NUM_PAGES = 4
    }
}