package com.example.proyectomaster.objects

class gameToF (pregunta: String?, respuesta:String? ) {

    var pregunta : String = ""
    var respuesta : String = ""

    constructor():this("","")
    init {
        this.pregunta = pregunta!!
        this.respuesta = respuesta!!
    }
}