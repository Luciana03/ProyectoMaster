package com.example.proyectomaster.objects

class noticia (titulo: String, titulo2: String, cuerpo: String, autor: String, fecha: String, urlImage: String) {

    var titulo : String
    var titulo2 : String
    var cuerpo : String
    var autor : String
    var fecha : String
    var urlImage: String

    init {
        this.titulo = titulo!!
        this.titulo2 = titulo2!!
        this.cuerpo = cuerpo!!
        this.autor = autor!!
        this.fecha = fecha!!
        this.urlImage = urlImage!!
    }
}