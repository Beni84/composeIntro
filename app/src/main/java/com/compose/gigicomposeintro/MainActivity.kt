package com.compose.gigicomposeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.compose.gigicomposeintro.ui.theme.GigiComposeIntroTheme

/* 1 - Crear una función que contenga un texto
   2 - Pasar una parámetro a la función
   3 - Que se vea una vista previa
   3a - Salude a varios usuarios
   4 - Añadir 2 textos más
   5 - Visualizar como listado
   6 - Añadir padding al listado
   7 - Añadir una imagen como primer elemento MaxWidth y 180dp altura
   8 - Añadir espacio entre elementos
   9 - Redondear bordes imagen
   10 - Estilo texto
   11 - Máximo 2 líneas
   12 - Mostrar boton 
 */

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {

    }
  }
}