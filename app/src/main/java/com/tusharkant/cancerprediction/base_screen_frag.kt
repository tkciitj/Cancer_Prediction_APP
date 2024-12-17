package com.tusharkant.cancerprediction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
class BaseScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutId = requireArguments().getInt(LAYOUT_ID_KEY)
        return inflater.inflate(layoutId, container, false)
    }
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
}
