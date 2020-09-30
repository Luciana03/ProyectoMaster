package com.example.proyectomaster.fragments.Juegos

import android.os.Bundle
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectomaster.R
import com.example.proyectomaster.adapters.NoticiaListAdapter
import com.example.proyectomaster.objects.gameToF
import com.example.proyectomaster.objects.noticia
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject
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

    var db =  FirebaseFirestore.getInstance()



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


        var docRef = db.collection("verdaderofalso")
        docRef.get()
            .addOnSuccessListener { dataSnapshot ->
                if (dataSnapshot != null) {
                    var documents = dataSnapshot.documents
                    for (snapshot in documents) {
                        snapshot.toObject<gameToF>()?.let { juegoVoFList.add(it) }
                    }
                }
                else {
                    Log.d("Test", "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("Test", "get failed with ", exception)
            }



        btnSiguiente.setOnClickListener {

            if (numeroDePregunta < juegoVoFList.size - 1){
                numeroDePregunta = numeroDePregunta + 1
                btnAnterior.visibility = View.VISIBLE
            }
            if (numeroDePregunta == juegoVoFList.size-1){
                btnSiguiente.visibility = View.INVISIBLE
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
                btnSiguiente.visibility = View.VISIBLE
            }
            if (numeroDePregunta == 0){
                btnAnterior.visibility = View.INVISIBLE
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

        if (numeroDePregunta == 0){
            btnAnterior.visibility = View.INVISIBLE
            btnSiguiente.visibility = View.VISIBLE
        }

        txtPregunta.text = juegoVoFList[0].pregunta
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            if (Falso.isChecked || Verdadero.isChecked) {
                txtRespuesta.text = juegoVoFList[0].respuesta
            }
        }

    }
}