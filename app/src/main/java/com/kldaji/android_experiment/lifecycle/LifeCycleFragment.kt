package com.kldaji.android_experiment.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kldaji.android_experiment.databinding.FragmentLifecycleBinding

class LifeCycleFragment : Fragment() {
    private var _binding: FragmentLifecycleBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("LifeCycleFragment", "onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCycleFragment", "onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        Log.d("LifeCycleFragment", "onCreateView()")
        _binding = FragmentLifecycleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("LifeCycleFragment", "onViewCreated()")
        Log.d("LifeCycleFragment", "$binding")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("LifeCycleFragment", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCycleFragment", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCycleFragment", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCycleFragment", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCycleFragment", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCycleFragment", "onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("LifeCycleFragment", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCycleFragment", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("LifeCycleFragment", "onDetach()")
    }
}
