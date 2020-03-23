package ru.hryasch.navapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment()
{
    private lateinit var button1: Button

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View?
    {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        button1 = view.findViewById(R.id.button1)


        button1.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToFragmentIntent1("Hello World")
           container?.findNavController()?.navigate(action)
        }

        return view
    }

}
