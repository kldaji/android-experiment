package com.kldaji.android_experiment.multifragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kldaji.android_experiment.databinding.FragmentOneBinding

class OneFragment : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("OneFragment", "onAttach()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("OneFragment", "onCreate()")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        Log.d("OneFragment", "onCreateView()")
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("OneFragment", "onViewCreated()")
        Log.d("OneFragment", "$binding")
        setButtonListener()
    }

    private fun setButtonListener() {
        binding.btnOne.setOnClickListener {
            Toast.makeText(requireContext(), "Fragment one", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("OneFragment", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("OneFragment", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("OneFragment", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("OneFragment", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("OneFragment", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("OneFragment", "onSaveInstanceState()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("OneFragment", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("OneFragment", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("OneFragment", "onDetach()")
    }
}
