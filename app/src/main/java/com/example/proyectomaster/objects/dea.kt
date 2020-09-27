package com.example.proyectomaster.objects

class dea (direccion: String?, nombreDelLugar: String?, telefono: String?, privado: String?, latitud: String?, longitud: String?, urlimage: String?) {

    var direccion: String = ""
    var nombreDelLugar: String = ""
    var telefono: String = ""
    var privado: String = ""
    var latitud: String = ""
    var longitud : String = ""
    var urlimage: String = ""

    constructor():this("","","","","","","")

    init {
        this.direccion = direccion!!
        this.nombreDelLugar = nombreDelLugar!!
        this.telefono = telefono!!
        this.privado = privado!!
        this.latitud = latitud!!
        this.longitud = longitud!!
        this.urlimage = urlimage!!
    }
}