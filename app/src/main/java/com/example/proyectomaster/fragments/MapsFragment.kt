package com.example.proyectomaster.fragments

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.proyectomaster.R
import com.example.proyectomaster.adapters.NoticiaListAdapter
import com.example.proyectomaster.objects.dea
import com.example.proyectomaster.objects.noticia

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.toObject
import kotlinx.coroutines.*

class MapsFragment : Fragment() {

    lateinit var v: View
    private lateinit var map: GoogleMap

    var deaList : MutableList<dea> = ArrayList<dea>()

    var i : Int = 0
    var Latitud : Double = 0.0
    var Longitud : Double = 0.0

    var db =  FirebaseFirestore.getInstance()


    private val callback = OnMapReadyCallback { googleMap ->

        deaList.add(dea("","escuela","","","-34.6063942","-58.4492897",""))
        deaList.add(dea("","Fundacion Cardiologica Argentina","","","-34.597034","-58.400563",""))
        deaList.add(dea("","Hospital Italiano de Buenos Aires","","","-34.6063773","-58.4433239",""))
        deaList.add(dea("","ORT sede Almagro","","","-34.6100019","-58.4293771",""))
        map = googleMap
        map.getUiSettings().setZoomControlsEnabled(true) //para que puedas modificar el zoom
        val ORT = LatLng(-34.6100019,-58.4293771) //les puse nombres cualquiea para los marcadores
        map.addMarker(MarkerOptions().position(ORT).title("ORT sede Almagro"))
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ORT, 12.0f))

        for ( i in 0 until deaList.size){
            Latitud = deaList[i].latitud.toDouble()
            Longitud = deaList[i].longitud.toDouble()
            var DEA = LatLng(Latitud,Longitud)
            map.addMarker(MarkerOptions().position(DEA).title(deaList[i].nombredellugar))
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        v = inflater.inflate(R.layout.fragment_maps, container, false)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

    override fun onStart() {
        super.onStart()

        /*var docRef = db.collection("deas")
        docRef.get()
            .addOnSuccessListener { dataSnapshot ->
                if (dataSnapshot != null) {
                    var documents = dataSnapshot.documents
                    for (snapshot in documents) {
                        snapshot.toObject<dea>()?.let { deaList.add(it) }
                    }
                } else {
                    Log.d("Test", "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("Test", "get failed with ", exception)
            }*/
    }
}