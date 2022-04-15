package com.example.food


import android.os.Bundle

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.get
import androidx.fragment.app.DialogFragment

class RateFragment : DialogFragment(R.layout.fragment_rate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val cancelbt:Button= view.findViewById(R.id.cancelBT);
        val submitbt:Button= view.findViewById(R.id.submitBT);
        val radioGroup= view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener{
            val selectedOption  = radioGroup.checkedRadioButtonId

            if(selectedOption==R.id.excellentRB) {
                Toast.makeText(context, "you rated Excellent", Toast.LENGTH_SHORT).show()
            }
            if(selectedOption==R.id.vgoodRB) {
                Toast.makeText(context, "you rated Very Good", Toast.LENGTH_SHORT).show()
            }
            if(selectedOption==R.id.goodRB) {
                Toast.makeText(context, "you rated Good", Toast.LENGTH_SHORT).show()
            }
            if(selectedOption==R.id.satisfactoryRB) {
                Toast.makeText(context, "you rated Satisfactory", Toast.LENGTH_SHORT).show()
            }
            if(selectedOption==R.id.poorRB) {
                Toast.makeText(context, "you rated Poor", Toast.LENGTH_SHORT).show()
            }


        }
    }

}




