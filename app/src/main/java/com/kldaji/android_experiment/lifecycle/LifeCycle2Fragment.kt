package com.kldaji.android_experiment.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kldaji.android_experiment.databinding.FragmentLifecycle2Binding

class LifeCycle2Fragment : Fragment() {
    private var _binding: FragmentLifecycle2Binding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("LifeCycle2Fragment", "onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycle2Fragment", "onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        Log.d("LifeCycle2Fragment", "onCreateView()")
        _binding = FragmentLifecycle2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycle2Fragment", "onViewCreated()")
        Log.d("LifeCycle2Fragment", "$binding")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("LifeCycle2Fragment", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycle2Fragment", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycle2Fragment", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle2Fragment", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycle2Fragment", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCycle2Fragment", "onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycle2Fragment", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycle2Fragment", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LifeCycle2Fragment", "onDetach()")
    }
}
