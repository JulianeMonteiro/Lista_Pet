package com.juliane.lista_pet

import android.graphics.drawable.Drawable

data class Pet(
    var foto: Drawable?=null,
    var nome: String,
    var descricao: String,
    var genero: Genero
)
