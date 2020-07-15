package com.example.proyectomaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

import com.example.proyectomaster.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentPerfil : Fragment() {

    lateinit var v: View

    lateinit var btnJuegos: Button
    lateinit var btnInstructivos: Button
    lateinit var btnSaberMas: Button
    lateinit var btnContacto: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_perfil, container, false)

        btnJuegos = v.findViewById(R.id.btnJuegos)
        btnInstructivos = v.findViewById(R.id.btnInstructivos)
        btnSaberMas = v.findViewById(R.id.btnSaberMas)
        btnContacto = v.findViewById(R.id.btnContacto)
        return v
    }


    override fun onStart() {
        super.onStart()


       btnJuegos.setOnClickListener {
            val a14 = FragmentPerfilDirections.actionFragmentPerfilToFragmentJuegos()
            v.findNavController().navigate(a14)
        }

        btnInstructivos.setOnClickListener {
            val a15 = FragmentPerfilDirections.actionFragmentPerfilToFragmentInstructivos()
            v.findNavController().navigate(a15)
        }

        btnSaberMas.setOnClickListener {
            val a16 = FragmentPerfilDirections.actionFragmentPerfilToFragmentSaberMas()
            v.findNavController().navigate(a16)
        }

        btnContacto.setOnClickListener {
            val a17 = FragmentPerfilDirections.actionFragmentPerfilToFragmentContacto()
            v.findNavController().navigate(a17)
        }
    }
}