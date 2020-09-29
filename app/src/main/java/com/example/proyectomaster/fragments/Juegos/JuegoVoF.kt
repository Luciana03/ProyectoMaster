package com.example.proyectomaster.fragments.Juegos

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.proyectomaster.R
import com.example.proyectomaster.objects.gameToF
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_juego_vo.*


class JuegoVoF : Fragment() {

    lateinit var v : View
    lateinit var txtPregunta: TextView
    lateinit var txtRespuesta: TextView
    lateinit var btnAnterior: Button
    lateinit var btnSiguiente: Button
    lateinit var radioGroup: RadioGroup

    var juegoVoFList : MutableList<gameToF> = ArrayList<gameToF>()

    var numeroDePregunta : Int = 0




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

        juegoVoFList.add(gameToF("Cuanto más tarde se comienza con RCP básica, mejor es el pronóstico" , "FALSO: la RCP básica precoz tiene mejor pronóstico"))
        juegoVoFList.add(gameToF("Lo primero que se debe hacer al ver a una persona que colapsa, es activar el sistema de emergencias" , "VERDADERO: lo primero que se debe hacer al ver a una persona que colapsa, es activar el sistema de emergencias y luego iniciar la RCP"))
        juegoVoFList.add(gameToF("El DEA precoz (desfibrilador automático externo) salva vidas" , "VERDADERO: la utilización de DEA en los primeros minutos del paro cardiaco, ante un ritmo cardíaco que pueda ser chocado (desfibrilado) salva vidas. El equipo es capaz de diferenciar entre ritmos desfibrilables y no desfibrilables, y le indica al que lo está utilizándolo como hacerlo"))
        juegoVoFList.add(gameToF("El teléfono del sistema de emergencias médicas es el 147" , "FALSO: el teléfono del sistema de emergencias médicas es el 107 a nivel nacional. Puede ser que algunas localidades tengan uno diferente. El 911 es el número de emergencias general, en todo el país"))


        btnSiguiente.setOnClickListener {

            if (numeroDePregunta < juegoVoFList.size - 1){
                numeroDePregunta = numeroDePregunta + 1
            }

            txtPregunta.text = juegoVoFList[numeroDePregunta].pregunta
            txtRespuesta.text = ""
            radioGroup.clearCheck()
            radioGroup.setOnCheckedChangeListener { group, checkedId ->
                if (Falso.isChecked || Verdadero.isChecked) {
                    txtRespuesta.text = juegoVoFList[numeroDePregunta].respuesta
                }
            }
        }



        btnAnterior.setOnClickListener {

            if (numeroDePregunta > 0 ){
                numeroDePregunta = numeroDePregunta - 1
            }

            txtPregunta.text = juegoVoFList[numeroDePregunta].pregunta
            txtRespuesta.text = ""
            radioGroup.clearCheck()
            radioGroup.setOnCheckedChangeListener { group, checkedId ->
                if (Falso.isChecked || Verdadero.isChecked) {
                    txtRespuesta.text = juegoVoFList[numeroDePregunta].respuesta
                }
            }
        }



        txtPregunta.text = juegoVoFList[0].pregunta
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (Falso.isChecked || Verdadero.isChecked) {
                txtRespuesta.text = juegoVoFList[0].respuesta
            }
        }



    }
}