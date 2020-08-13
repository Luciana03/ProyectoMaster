package com.example.proyectomaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.proyectomaster.R
import com.example.proyectomaster.adapters.NoticiaListAdapter
import com.example.proyectomaster.objects.noticia

/**
 * A simple [Fragment] subclass.
 */
class listFragmentNoticias : Fragment() {

    lateinit var v: View

    lateinit var recNoticias : RecyclerView

    var noticias : MutableList<noticia> = ArrayList<noticia>()

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var noticiaListAdapter: NoticiaListAdapter

    companion object {
        fun newInstance() = FragmentNoticias()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list_noticias, container, false)
        recNoticias = v.findViewById(R.id.rec_noticias)
        return v
    }


    override fun onStart() {
        super.onStart()

        noticias.add(noticia("Los riesgos de ser un paciente con enfermedad " , "Los riesgos de ser un paciente con enfermedad cardiovascular en época del COVID-19" , "Cuerpo de la noticia1" , "Yo1" , "30 de mayo1" , "data:image/jpeg;base64,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"))
        noticias.add(noticia("Documento de posición Sociedad Argentina de" , "Documento de posición Sociedad Argentina de Cardiología – Fundación Cardiológica Argentina: Enfermedad Cardiovascular en tiempos de COVID-19" , "Cuerpo de la noticia2", "Yo2" , "30 de mayo2" , "http://www.fundacioncardiologica.org/Multimedios/imgs/535_760.jpg?v=18"))
        noticias.add(noticia("Sedentarismo, una pandemia mundial de gran impacto en" , "" , "" , "" , "" , ""))
        noticias.add(noticia("Fumar y vapear predisponen a los pulmones a infecciones" , "" , "" , "" , "" , ""))
        noticias.add(noticia("RCP y Coronavirus: Cuidados a tener en cuenta por el" , "" , "" , "" , "" , ""))
        noticias.add(noticia("Población de riesgo en casa: consejos para mantener una" , "" , "" , "" , "" , ""))
        noticias.add(noticia("Cómo mantenernos saludables en casa en épocas del" , "" , "" , "" , "" , ""))
        noticias.add(noticia("Coronavirus: por qué las personas hipertensas" , "" , "" , "" , "" , ""))




        recNoticias.setHasFixedSize(true) //Marcar el Recycler View como de tamaño fijo

        //Indicar el tipo de layout que va a tener el Recycler View
        linearLayoutManager = LinearLayoutManager(context)
        recNoticias.layoutManager = linearLayoutManager

        noticiaListAdapter = NoticiaListAdapter(noticias,requireContext()){position -> onItemClick(position)}
        //noticiaListAdapter = NoticiaListAdapter(listaDenoticia) //Indicar el tipo de adaptador del item
        recNoticias.adapter = noticiaListAdapter
    }

    fun onItemClick ( position : Int ) {


        var Titulo2 = noticias[position].titulo2
        var Cuerpo = noticias[position].cuerpo
        var Fecha = noticias[position].fecha
        var Autor = noticias[position].autor
        var Imagen = noticias[position].urlImage

        val a12= listFragmentNoticiasDirections.actionListFragmentNoticias2ToFragmentNoticias(Titulo2,Cuerpo,Fecha,Autor,Imagen)
        v.findNavController().navigate(a12)
    }
}
