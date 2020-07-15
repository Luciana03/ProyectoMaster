package com.example.proyectomaster.objects

class dea (direccion: String, nombreDelLugar: String, telefono: Double, privado: Boolean, latitud: Double, longitud: Double, imagen: String) {

    var direccion: String
    var nombreDelLugar: String
    var telefono: Double
    var privado: Boolean
    var latitud: Double
    var longitud : Double


    init {
        this.direccion = direccion
        this.nombreDelLugar = nombreDelLugar
        this.telefono = telefono
        this.privado = privado
        this.latitud = latitud
        this.longitud = longitud
    }
}