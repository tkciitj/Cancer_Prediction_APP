package com.tusharkant.cancerprediction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class BaseScreenFragment : Fragment() {

    companion object {
        private const val LAYOUT_ID_KEY = "layout_id"

        fun newInstance(layoutId: Int): BaseScreenFragment {
            val fragment = BaseScreenFragment()
            val args = Bundle()
            args.putInt(LAYOUT_ID_KEY, layoutId)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val layoutId = arguments?.getInt(LAYOUT_ID_KEY)
        return inflater.inflate(layoutId ?: R.layout.one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Handle Next button
        val nextButton = view.findViewById<View>(R.id.next_button)
        nextButton?.setOnClickListener {
            (activity as? MainActivity)?.goToNextScreen()
        }

        // Handle Previous button
        val prevButton = view.findViewById<View>(R.id.prev_button)
        prevButton?.setOnClickListener {
            (activity as? MainActivity)?.goToPreviousScreen()
        }
    }
}

