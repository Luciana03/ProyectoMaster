package com.example.proyectomaster.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.example.proyectomaster.R

/**
 * A simple [Fragment] subclass.
 */
class FragmentSaberMas : Fragment() {

    lateinit var v: View

    lateinit var txtPregunta1: TextView
    lateinit var txtPregunta2: TextView
    lateinit var txtPregunta3: TextView
    lateinit var txtPregunta4: TextView
    lateinit var txtPregunta5: TextView
    lateinit var txtPregunta6: TextView
    lateinit var txtPregunta7: TextView

    lateinit var txtRespuesta1: TextView
    lateinit var txtRespuesta2: TextView
    lateinit var txtRespuesta3: TextView
    lateinit var txtRespuesta4: TextView
    lateinit var txtRespuesta5: TextView
    lateinit var txtRespuesta6: TextView
    lateinit var txtRespuesta7: TextView

    lateinit var txtImportante: TextView
    lateinit var txtImportante2: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_saber_mas, container, false)

        txtPregunta1 = v.findViewById(R.id.txtPregunta1)
        txtPregunta2 = v.findViewById(R.id.txtPregunta2)
        txtPregunta3 = v.findViewById(R.id.txtPregunta3)
        txtPregunta4 = v.findViewById(R.id.txtPregunta4)
        txtPregunta5 = v.findViewById(R.id.txtPregunta5)
        txtPregunta6 = v.findViewById(R.id.txtPregunta6)
        txtPregunta7 = v.findViewById(R.id.txtPregunta7)

        txtRespuesta1 = v.findViewById(R.id.txtRespuesta1)
        txtRespuesta2 = v.findViewById(R.id.txtRespuesta2)
        txtRespuesta3 = v.findViewById(R.id.txtRespuesta3)
        txtRespuesta4 = v.findViewById(R.id.txtRespuesta4)
        txtRespuesta5 = v.findViewById(R.id.txtRespuesta5)
        txtRespuesta6 = v.findViewById(R.id.txtRespuesta6)
        txtRespuesta7 = v.findViewById(R.id.txtRespuesta7)

        txtImportante = v.findViewById(R.id.txtImportante)
        txtImportante2 = v.findViewById(R.id.txtImportante2)

        return v
    }

    override fun onStart() {
        super.onStart()

        txtPregunta1.text = "1) ¿Desde qué edad es bueno hacerse un chequeo cardiaco si hay antecedentes familiares?"
        txtRespuesta1.text = "Si hay antecedentes importantes en la familia, la idea es realizarse tempranamente (20 años) un chequeo de los factores de riesgo más importantes (presión arterial, niveles de azúcar y colesterol en la sangre), además de prevenir manteniendo una dieta saludable, realizando regularmente ejercicio y dejando de fumar."

        txtPregunta2.text = "2) ¿Qué exámenes específicos cardiacos hay que hacerse?"
        txtRespuesta2.text = "Se sugiere una evaluación médica con toma de presión arterial y examen físico, perfil lipídico, glicemia, test de esfuerzo y electrocardiograma."

        txtPregunta3.text = "3) ¿Cuáles son los síntomas que nos pueden avisar de una enfermedad cardiaca?"
        txtRespuesta3.text = "Inicialmente no hay síntomas sino factores de riesgo elevados, como hipertensión arterial (no controlada), colesterol alto, azúcar elevada en la sangre, sobrepeso, tabaquismo y sedentarismo. La idea es prevenir y nunca llegar a tener síntomas, ya que éstos implican que la enfermedad ya está consolidada."

        txtPregunta4.text = "4) ¿Las personas con diabetes y alteraciones a la tiroides tienen más posibilidad de padecer problemas al corazón?"
        txtRespuesta4.text = "Efectivamente, la diabetes aumenta considerablemente el riesgo de tener un evento cardiovascular. Con respecto a alteraciones en la glándula tiroides, no deberían haber problemas, siempre y cuando esté controlada con tratamiento."

        txtPregunta5.text = "5) ¿Tomar todos los días ácido acetilsalicílico es mucho o poco?"
        txtRespuesta5.text = "La aspirina está recomendada en prevención secundaria, cuando ya se ha tenido un evento cardiovascular, o en prevención primaria, cuando existe un riesgo alto de tenerlo. El resto de la población debe consultar con su médico antes de tomar un tratamiento como este."

        txtPregunta6.text = "6) ¿Tener taquicardias breves es señal de que algo anda mal?"
        txtRespuesta6.text = "Las taquicardias son normales si se presentan como respuesta a dolor, estrés o actividad física, por ejemplo. Cuando una taquicardia aparece sin causa clara es preferible consultar a un cardiólogo."

        txtPregunta7.text = "7) ¿Se puede viajar en avión con marcapasos?"
        txtRespuesta7.text = "Sí, no hay problema en realizar un viaje en avión con marcapasos. Siempre es conveniente llevar una credencial que acredite que se tiene, para mostrarla en el paso por policía internacional."

        txtImportante.text = "Importante:"
        txtImportante2.text = "Es fundamental una alimentación saludable, mantener un peso normal y realizar actividad física habitualmente. La idea es prevenir y nunca llegar a tener síntomas, ya que estos implican que la enfermedad ya está consolidada."
    }
}
