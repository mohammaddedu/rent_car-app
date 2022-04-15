package com.example.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import android.widget.ArrayAdapter

import android.widget.*
import androidx.fragment.app.DialogFragment


class OrderFragment : DialogFragment() {

val types = arrayOf("Pizza","Shawerma","Burger","Grill Chicken","Steak")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val t=inflater.inflate(R.layout.fragment_order, container, false)
        val spinner = t.findViewById<Spinner>(R.id.spinner1)
        spinner?.adapter = activity?.applicationContext?.let { ArrayAdapter(it, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, types) } as SpinnerAdapter
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("err")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val type = parent?.getItemAtPosition(position).toString()
                Toast.makeText(activity,"you ordered "+type, Toast.LENGTH_LONG).show()
                println(type)
            }

        }
        return t
    }
}