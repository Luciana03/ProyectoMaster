package com.example.proyectomaster.objects

class noticia (titulo: String, cuerpo: String, autor: String, fecha: String, urlImage: String) {

    var titulo : String
    var cuerpo : String
    var autor : String
    var fecha : String
    var urlImage: String

    init {
        this.titulo = titulo!!
        this.cuerpo = cuerpo!!
        this.autor = autor!!
        this.fecha = fecha!!
        this.urlImage = urlImage!!
    }
}