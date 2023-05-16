package com.example.bodyboost

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Home : Fragment() {

//im here int for cardview id
    private lateinit var cardView1: CardView
    private lateinit var cardView2: CardView
    private lateinit var cardView3: CardView
    private lateinit var cardView4: CardView


    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)

// Найдите все CardView из макета и присвойте им переменные
        cardView1 = view.findViewById(R.id.tv_water_card)
        cardView2 = view.findViewById(R.id.tv_medicine_card)
        cardView3 = view.findViewById(R.id.tv_food_card)
        cardView4 = view.findViewById(R.id.tv_sleep_card)

        // Установите обработчики нажатий на каждую CardView
        cardView1.setOnClickListener {
            val intent = Intent(activity, WaterActivity::class.java)
            startActivity(intent)
        }

        cardView2.setOnClickListener {
            // здесь можно добавить переход на другую активити для второй CardView
            val intent = Intent(activity, MedicineActivity::class.java)
            startActivity(intent)
        }

        cardView3.setOnClickListener {
            // здесь можно добавить переход на другую активити для третьей CardView
            val intent = Intent(activity, FoodActivity::class.java)
            startActivity(intent)
        }

        cardView4.setOnClickListener {
            // здесь можно добавить переход на другую активити для четвертой CardView
            val intent = Intent(activity, SleepActivity::class.java)
            startActivity(intent)
        }

        // Inflate the layout for this fragment
        return view
    }

    companion object {

        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = Home()
        fun newInstance(param1: String, param2: String) =
            Home().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}