package com.example.proyectomaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import com.bumptech.glide.Glide

import com.example.proyectomaster.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentNoticias : Fragment() {

    lateinit var v: View

    lateinit var txtFecha: TextView
    lateinit var txtTitulo: TextView
    lateinit var txtCuerpo: TextView
    lateinit var txtAutor: TextView
    lateinit var btnVolver: Button
    lateinit var imgNoticia: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_noticias, container, false)

        txtFecha = v.findViewById(R.id.txtFecha)
        txtTitulo = v.findViewById(R.id.txtTitulo)
        txtCuerpo = v.findViewById(R.id.txtCuerpo)
        txtAutor = v.findViewById(R.id.txtAutor)
        imgNoticia = v.findViewById(R.id.imgNoticia)
        return v
    }

    override fun onStart() {
        super.onStart()

        val Fecha = FragmentNoticiasArgs.fromBundle(requireArguments()).Fecha
        val Titulo = FragmentNoticiasArgs.fromBundle(requireArguments()).Titulo
        val Cuerpo = FragmentNoticiasArgs.fromBundle(requireArguments()).Cuerpo
        val Autor = FragmentNoticiasArgs.fromBundle(requireArguments()).Autor
        val urlImage = FragmentNoticiasArgs.fromBundle(requireArguments()).urlImage

        txtFecha.text = Fecha
        txtTitulo.text = Titulo
        txtCuerpo.text = Cuerpo
        txtAutor.text = Autor

        Glide
            .with(v)
            .load(urlImage)
            .centerCrop()
            .fitCenter()
            .into(imgNoticia)

    }
}
