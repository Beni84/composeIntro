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
   2 - Que se vea una vista previa
   3 - Pasar una parámetro a la función
   3a - Salude a varios usuarios
   5 - Visualizar como listado
   6 - Añadir padding y background al listado
   7 - Añadir una imagen como primer elemento MaxWidth y 180dp altura
   8 - Añadir espacio entre elementos
   8a - Añadir background a cada texto
   8b - Añadir espacio entre color y texto
   9 - Redondear bordes imagen
   10 - Estilo texto
   11 - Máximo 2 líneas
   12 - Mostrar boton con Leer Más y alinear a la derecha
   13 - Se muestra una Toast cuando se muestra un boton.
 */

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {

    }
  }
}