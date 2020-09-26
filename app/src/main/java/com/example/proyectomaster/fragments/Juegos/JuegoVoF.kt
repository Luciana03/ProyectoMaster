package com.example.proyectomaster.fragments.Juegos

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.proyectomaster.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_juego_vo.*


class JuegoVoF : Fragment() {

    lateinit var v : View
    lateinit var txtPregunta: TextView
    lateinit var txtRespuesta: TextView
    lateinit var btnAnterior: Button
    lateinit var btnSiguiente: Button
    lateinit var radioGroup: RadioGroup
    lateinit var radioButton: RadioButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_juego_vo, container, false)
        txtPregunta = v.findViewById(R.id.txtPregunta)
        txtRespuesta = v.findViewById(R.id.txtRespuesta)
        btnAnterior = v.findViewById(R.id.btnAnterior)
        btnSiguiente = v.findViewById(R.id.btnSiguiente)
        radioGroup = v.findViewById(R.id.radioGroup)
        return v
    }

    override fun onStart() {
        super.onStart()
        txtPregunta.text = "Cuanto más tarde se comienza con RCP básica, mejor es el pronóstico"

        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (Falso.isChecked || Verdadero.isChecked) {
                txtRespuesta.text = "FALSO: la RCP básica precoz tiene mejor pronóstico"
            }
        }
    }
}