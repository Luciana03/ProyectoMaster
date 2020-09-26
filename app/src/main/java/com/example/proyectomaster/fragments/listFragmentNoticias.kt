package com.example.proyectomaster.fragments

import android.content.ContentValues.TAG
import android.graphics.Insets.add
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.iterator
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.proyectomaster.R
import com.example.proyectomaster.adapters.NoticiaListAdapter
import com.example.proyectomaster.objects.noticia
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.firestore.ktx.toObject
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.fragment_list_noticias.*


/**
 * A simple [Fragment] subclass.
 */
class listFragmentNoticias : Fragment() {

    lateinit var v: View

    var db =  FirebaseFirestore.getInstance()

    lateinit var recNoticias : RecyclerView

    var noticiaList : MutableList<noticia> = ArrayList<noticia>()

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel
    }


    override fun onStart() {
        super.onStart()


        val noticia1 = hashMapOf(
            "titulo" to "Los riesgos de ser un paciente con enfermedad",
            "titulo2" to "Los riesgos de ser un paciente con enfermedad cardiovascular en época del COVID-19",
            "cuerpo" to "Encuesta de la Fundación Cardiológica Argentina que muestra el Lado B de esta pandemia.\n" +
                    "\n" +
                    "La edad media de los encuestados fue 56 años. La mayoría mujeres (66.8%).\n" +
                    "El 42% refirió haber necesitado atención médica por su enfermedad cardiovascular (ECV), pero más de la mitad no pudieron hacerla (57.9%).\n" +
                    "Casi 4 de cada 10 no recibieron la vacunación correspondiente (36.7%).\n" +
                    "5.5 de cada 10 se sintió muy o más o menos desprotegido por parte de su sistema de salud.\n" +
                    "Buenos Aires, 15 de mayo de 2020. La Fundación Cardiológica Argentina (FCA) presenta los resultados de una encuesta desarrollada para conocer el acceso a la atención médica e información sanitaria en pacientes con enfermedades cardiovasculares durante el aislamiento social obligatorio y preventivo.\n" +
                    "\n" +
                    "En la Fundación Cardiológica Argentina sabemos que nunca es buen momento para estar enfermo pero, ante la situación que estamos atravesando en nuestro país a partir de las medidas de aislamiento dispuestas para combatir la pandemia del COVID-19, nos encontramos frente a una realidad particularmente estresante para quienes puedan necesitar atención médica por otra causa.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "“Somos conscientes de que, por un lado, la atención médica está centrada en el COVID-19 y por el otro, por temor a salir de sus hogares y contagiarse de coronavirus, muchos pacientes demoran la consulta, aún teniendo síntomas de alerta. En este sentido, es muy importante recordar que las personas con enfermedades crónicas necesitan atención, ya que en época de pandemia se corre el riesgo de que haya un aumento en la mortalidad de origen cardiovascular (CV), un grupo de afecciones que, en Argentina y en el mundo, son la primera causa de muerte”, afirma el doctor Jorge Tartaglione, presidente de la Fundación Cardiológica Argentina.\n" +
                    "\n" +
                    "Las patologías preexistentes siguen su curso sin controles, lo que puede conducirnos a un desastre sanitario. “Los accidentes cerebrovasculares y los infartos cardíacos continúan ocurriendo y las principales enfermedades crónicas que sufren los argentinos corren riesgo de quedar desatendidas en épocas de pandemia. Esto nos llevó a querer conocer qué y cómo se siente el paciente con enfermedad cardiovascular en nuestro país”, agrega la doctora Stella Pereiro, miembro del Comité Ejecutivo de la FCA y directora de investigación de la “Encuesta para pacientes con enfermedad cardiovascular en la época de COVID-19”.\n" +
                    "\n" +
                    "Este escenario se produce por varios factores: temor de las personas a contagiarse el coronavirus en el hospital, preocupación de tener problemas para movilizarse, no tener disponible a su médico de cabecera o la decisión del paciente de postergar estudios y consultas hasta que termine el aislamiento.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Datos más relevantes de la encuesta:\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Atención médica: cuatro de cada 10 pacientes refieren haber necesitado atención médica por su enfermedad cardiovascular (ECV) (42%). De aquellos pacientes que requirieron consultar, más de la mitad no pudieron hacerla (57.9%).\n" +
                    "Causas de la falta de acceso a la consulta: 68.2% falta de atención por parte del sistema de salud.\n" +
                    "Uso de la tecnología: 51% NO tuvieron acceso a algún tipo de consulta virtual por su enfermedad cardiovascular. El 62% de los que tuvieron acceso, NO necesitaron utilizarla.\n" +
                    "Necesidad de recetas médicas para el tratamiento de la ECV (72%). De los cuales, la mayoría tuvo  acceso con normalidad (60.6%), algo dificultoso (19.8%), extremadamente dificultoso (5.9%). Y un  13% no consiguió recetas.\n" +
                    "La vacunación en los pacientes con ECV es de vital importancia para evitar formas graves de neumonía o gripe. Solo el 41.4% de las personas pudo vacunarse con normalidad. Lamentablemente casi 4 de cada 10 pacientes no recibió la vacunación correspondiente (36.7%).\n" +
                    "Al consultar sobre si los sistemas de salud brindaban educación sanitaria calificada y seria sobre las patologías cardiovasculares o COVID-19, casi la mitad de los encuestados informaron negativamente (45%) versus el 38% que informaron que sí, pero 63.6% no la utilizaron. 7.6% no saben si su sistema de salud brinda educación por algún medio y 8.3% realizaron investigación personal.\n" +
                    "Con el fin de conocer si se sentían protegidos por su sistema de salud ante la situación actual, casi 2 de cada 10 encuestados informó sentirse muy desprotegido (19.2%) y 35.4% mas o menos desprotegido. 45% se sintieron protegidos, pero solo el 18% de este grupo se sintió muy protegido. (5.5 de cada 10 se sintió muy o mas o menos desprotegido)\n" +
                    "Aislamiento: los encuestados autopercibieron, en el 92,4% de los casos, que cumplieron totalmente el aislamiento social preventivo obligatorio, 3,4%  refieren haber hecho algunas salidas innecesarias y el 4% refirieron no haber podido cumplir con el aislamiento.\n" +
                    " \n" +
                    "\n" +
                    "Metodología y ficha técnica:\n" +
                    "\n" +
                    "Objetivo: proporcionar datos sobre el acceso a la atención médica e información sanitaria durante el aislamiento preventivo y obligatorio a causa de la pandemia por COVID-19.\n" +
                    "\n" +
                    "La encuesta se realizó entre el 1 y el 6 de mayo de 2020. Se utilizó Google Formularios y constó de 15 preguntas.\n" +
                    "\n" +
                    "La muestra estuvo integrada por 1536 habitantes de la República Argentina con enfermedad Cardiovascular (ECV) que accedieron a la encuesta en forma voluntaria y por auto reporte. De éstos, se descartaron 49 por no presentar enfermedad cardiovascular, por lo tanto, el análisis final se llevó a cabo sobre una muestra de 1487 encuestas.\n" +
                    "\n" +
                    "La edad media fue 56.17 (DE ±14.0) años, siendo la mayoría de los respondedores mujeres (66.8%).\n" +
                    "\n" +
                    "La asistencia médica que informaron los encuestados correspondió el 44.3% a Obra Social, 29% Medicina Prepaga, sector público  y PAMI 10.8% y 11% respectivamente y 7.1% en forma particular.\n" +
                    "\n" +
                    "La distribución de las enfermedades cardiovasculares más frecuentes, donde el encuestado informa la que considera más importante y para la cual se encuentra medicado fue:  52.1%  Hipertensión arterial 10% infarto de miocardio, 8,1% insuficiencia cardíaca crónica y 6.9% arritmias. El resto se distribuyó entre otras enfermedades (aparición Cardiopatías congénitas, portador de marcapasos u otro dispositivo, cirugía cardíaca (de by pass o válvulas), angina de pecho sin infarto, angioplastia coronaria, enfermedad valvular, etc.)",
            "autor" to " ",
            "fecha" to "Noticias | 15 may 2020",
            "urlimage" to "http://www.fundacioncardiologica.org/Multimedios/imgs/535_760.jpg?v=18"
        )

        db.collection("noticias").document("noticia1")
            .set(noticia1)




        var docRef = db.collection("noticias")
        docRef.get()
            .addOnSuccessListener { dataSnapshot ->
                if (dataSnapshot != null) {
                    var documents = dataSnapshot.documents
                    for (snapshot in documents) {
                        snapshot.toObject<noticia>()?.let { noticiaList.add(it) }
                    }
                    recNoticias.setHasFixedSize(true) //Marcar el Recycler View como de tamaño fijo

                    linearLayoutManager = LinearLayoutManager(context)  //PODES ELEGIR VERTICAL U HORIZONTAL CON EL MANAGER
                    recNoticias.layoutManager = linearLayoutManager //SI PONGO GRID LAYOUT, puedo hacer cuadraditos en vez de lineas.

                    noticiaListAdapter = NoticiaListAdapter(noticiaList,requireContext()){position -> onItemClick(position)}
                    recNoticias.adapter = noticiaListAdapter

                } else {
                    Log.d("Test", "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d("Test", "get failed with ", exception)
            }
    }


    fun onItemClick ( position : Int ) {

        var Titulo2 = noticiaList[position].titulo2
        var Cuerpo = noticiaList[position].cuerpo
        var Fecha = noticiaList[position].fecha
        var Autor = noticiaList[position].autor
        var Imagen = noticiaList[position].urlimage

        val a12= listFragmentNoticiasDirections.actionListFragmentNoticias2ToFragmentNoticias(Titulo2,Cuerpo,Fecha,Autor,Imagen)
        v.findNavController().navigate(a12)
    }
}
