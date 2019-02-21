package com.firerocks.gametime.ui.gamers.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.firerocks.gametime.R

class GamersListFragment : Fragment() {

    companion object {
        fun newInstance() = GamersListFragment()
    }

    private lateinit var viewModel: GamersListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gamers_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GamersListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
