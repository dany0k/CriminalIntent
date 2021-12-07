package ru.vsu.cs.zmaev.criminalintent

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlin.reflect.KProperty


private const val TAG = "CrimeListFragment"

class CrimeListFragment : Fragment() {
    val factory by lazy { CrimeListViewModelFactory() }
    private val crimeListViewModel: CrimeListViewModel by lazy {
        ViewModelProvider(this@CrimeListFragment, factory).get(CrimeListViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Total crimes: ${crimeListViewModel.crimes.size}")
    }
    
    companion object {
        fun newInstance(): CrimeListFragment {
            return newInstance()
        }
    }
}

