package com.example.proyectomaster.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

import com.example.proyectomaster.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentContacto : Fragment() {

    lateinit var v: View
    lateinit var  imageLogo: ImageView
    lateinit var txtAboutUs: TextView
    lateinit var  imageTw: ImageView
    lateinit var  imageFace: ImageView
    lateinit var  imageInternet: ImageView
    lateinit var  imageInsta: ImageView
    lateinit var  imageYoutube: ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_contacto, container, false)
        imageLogo = v.findViewById(R.id.imageLogo)
        imageFace = v.findViewById(R.id.imageFace)
        imageInsta = v.findViewById(R.id.imageInsta)
        imageTw = v.findViewById(R.id.imageTw)
        imageInternet = v.findViewById(R.id.imageInternet)
        imageInternet = v.findViewById(R.id.imageYoutube)
        txtAboutUs = v.findViewById(R.id.txtAboutUs)

        return v
    }
    override fun onStart() {
        super.onStart()

        txtAboutUs.text="       Sobre Nosotros\n" +  "- Dirección: Azcuénaga 980, CABA, Argentina\n" +
                " - Teléfono:   011 4961-6520\n" +
                " - Sitio Web: http://www.fundacioncardiologica.org/ \n" +
                " - Correo: info@fundacioncardiologica.org\n" +
                " - Más info: La Fundación Cardiológica Argentina es una entidad de bien público no gubernamental, sin fines de lucro que se encuentra constituida por profesionales de diferentes especialidades que trabajan en forma honoraria y conforman así el Comité Ejecutivo. Tiene presencia en todo el país por medio de los Distritos Regionales de la Sociedad Argentina de Cardiología. Esta afiliada a la Federación Mundial del Corazón (World Heart Federation) y a la Fundación Interamericana del Corazón (Interamerican Heart Foundation).\n" +
                "\n" +
                "En este contexto desarrolla sus actividades que básicamente se dividen en 3 grandes áreas: Investigación, Comunidad y Educación."

        imageFace.setOnClickListener {
            val uri2: Uri = Uri.parse("https://es-la.facebook.com/FundacionCardiologicaArgentina/")
            val intent2 = Intent(Intent.ACTION_VIEW, uri2)
            startActivity(intent2)
        }

        imageInsta.setOnClickListener {
            val uri3: Uri = Uri.parse("https://www.instagram.com/fundacioncardiologica/?hl=es-la")
            val intent3 = Intent(Intent.ACTION_VIEW, uri3)
            startActivity(intent3)
        }

        imageInternet.setOnClickListener {
            val uri4: Uri = Uri.parse("http://www.fundacioncardiologica.org/")
            val intent4 = Intent(Intent.ACTION_VIEW, uri4)
            startActivity(intent4)
        }

        imageTw.setOnClickListener {
            val uri: Uri = Uri.parse("https://twitter.com/f_cardiologica?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        /*imageYoutube.setOnClickListener {
            val uri: Uri = Uri.parse("https://www.youtube.com/user/fundcardiologica")
            val intent = Intent(Intent.ACTION_VIEW, uri5)
            startActivity(intent)
        }*/
    }
}
