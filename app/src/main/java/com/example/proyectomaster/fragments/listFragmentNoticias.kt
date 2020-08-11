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

        noticias.add(noticia("Próximas actividades","Cuerpo de la noticia1","Yo1","30 de mayo1","\"https://http2.mlstatic.com/D_NQ_NP_605204-MLA31040454909_062019-O.webp"))
        noticias.add(noticia("Titulo de la noticia2","Cuerpo de la noticia2","Yo2","30 de mayo2","\"https://http2.mlstatic.com/D_NQ_NP_605204-MLA31040454909_062019-O.webp"))
        noticias.add(noticia("Titulo de la noticia3","Cuerpo de la noticia3","Yo3","30 de mayo3","\"https://http2.mlstatic.com/D_NQ_NP_605204-MLA31040454909_062019-O.webp"))
        noticias.add(noticia("Titulo de la noticia4","Cuerpo de la noticia4","Yo4","30 de mayo4","\"https://http2.mlstatic.com/D_NQ_NP_605204-MLA31040454909_062019-O.webp"))


        recNoticias.setHasFixedSize(true) //Marcar el Recycler View como de tamaño fijo

        //Indicar el tipo de layout que va a tener el Recycler View
        linearLayoutManager = LinearLayoutManager(context)
        recNoticias.layoutManager = linearLayoutManager

        noticiaListAdapter = NoticiaListAdapter(noticias,requireContext()){position -> onItemClick(position)}
        //noticiaListAdapter = NoticiaListAdapter(listaDenoticia) //Indicar el tipo de adaptador del item
        recNoticias.adapter = noticiaListAdapter
    }

    fun onItemClick ( position : Int ) {


        var Titulo = noticias[position].titulo
        var Cuerpo = noticias[position].cuerpo
        var Fecha = noticias[position].fecha
        var Autor = noticias[position].autor
        var Imagen = noticias[position].urlImage

        val a12= listFragmentNoticiasDirections.actionListFragmentNoticias2ToFragmentNoticias(Titulo,Cuerpo,Fecha,Autor,Imagen)
        v.findNavController().navigate(a12)
    }
}
