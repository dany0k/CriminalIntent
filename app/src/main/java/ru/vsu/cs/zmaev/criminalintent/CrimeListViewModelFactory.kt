package ru.vsu.cs.zmaev.criminalintent

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class CrimeListViewModelFactory() : ViewModelProvider.Factory
{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return modelClass.getConstructor().newInstance()
    }
}