package com.firerocks.gametime.ui.gamers.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.firerocks.gametime.R

class GamersDetailFragment : Fragment() {

    companion object {
        fun newInstance() = GamersDetailFragment()
    }

    private lateinit var viewModel: GamersDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gamers_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GamersDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
