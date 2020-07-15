package com.example.proyectomaster.objects

class usuario (nombre: String, contraseña: String, autorizado: Boolean) {

    var nombre : String
    var contraseña : String
    var autorizado : Boolean

    init {
        this.nombre = nombre
        this.contraseña = contraseña
        this.autorizado = autorizado
    }
}