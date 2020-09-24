package com.example.proyectomaster.fragments.Juegos

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.example.proyectomaster.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_juego_vo.*


class JuegoVoF : Fragment() {

    lateinit var v : View
    lateinit var txtPregunta: TextView
    lateinit var txtRespuesta: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_juego_vo, container, false)
        txtPregunta = v.findViewById(R.id.txtPregunta)
        txtRespuesta = v.findViewById(R.id.txtRespuesta)
        return v
    }

    override fun onStart() {
        super.onStart()
        txtPregunta.text = "Cuanto más tarde se comienza con RCP básica, mejor es el pronóstico"

        btnCheck.setOnClickListener {
            if (btnFalso.isChecked || btnVerdadero.isChecked) {
                txtRespuesta.text = "FALSO: la RCP básica precoz tiene mejor pronóstico"
            } else {
                val toast = Toast.makeText(activity, "Elija una opción", Toast.LENGTH_LONG)
                toast.setGravity(Gravity.BOTTOM, 0, 200)
                toast.show()
            }
        }
    }
}