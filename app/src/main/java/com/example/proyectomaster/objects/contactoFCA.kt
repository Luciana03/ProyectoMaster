package com.example.proyectomaster.objects

class contactoFCA (direccion: String, telefono: Double, sitioWeb: String, mail: String, descripcion: String) {
    var direccion: String
    var telefono: Double
    var sitioWeb: String
    var mail: String
    var descripcion: String

    init {
        this.direccion = direccion
        this.telefono = telefono
        this.sitioWeb = sitioWeb
        this.mail = mail
        this.descripcion = descripcion
    }
}