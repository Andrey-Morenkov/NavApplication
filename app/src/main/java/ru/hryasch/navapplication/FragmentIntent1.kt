package ru.hryasch.navapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class FragmentIntent1 : Fragment()
{

    private lateinit var toolbar: Toolbar
    private lateinit var navC: NavController
    private lateinit var text: TextView

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_intent1, container, false)
        navC = container!!.findNavController()
        toolbar = view.findViewById(R.id.toolbar)
        text = view.findViewById(R.id.textView123)

        (activity as AppCompatActivity).setSupportActionBar(toolbar)

        (activity as AppCompatActivity).supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        (activity as AppCompatActivity).supportActionBar!!.setDisplayShowHomeEnabled(true)

        toolbar.setNavigationOnClickListener {
            navC.navigateUp()
        }

        text.text = FragmentIntent1Args.fromBundle(arguments!!).testArg

        return view
    }

}
