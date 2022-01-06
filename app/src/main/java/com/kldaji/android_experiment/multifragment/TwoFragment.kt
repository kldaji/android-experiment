package com.kldaji.android_experiment.multifragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kldaji.android_experiment.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {
    private var _binding: FragmentTwoBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("TwoFragment", "onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TwoFragment", "onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        Log.d("TwoFragment", "onCreateView()")
        _binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("TwoFragment", "onViewCreated()")
        Log.d("TwoFragment", "$binding")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("TwoFragment", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("TwoFragment", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TwoFragment", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TwoFragment", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TwoFragment", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("TwoFragment", "onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("TwoFragment", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TwoFragment", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("TwoFragment", "onDetach()")
    }
}
