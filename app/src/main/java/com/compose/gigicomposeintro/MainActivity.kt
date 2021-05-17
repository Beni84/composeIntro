package com.compose.gigicomposeintro

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Snackbar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow.Clip
import androidx.compose.ui.text.style.TextOverflow.Ellipsis
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
      MultipleGreeting(emptyList())
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(
    text = "Hello, ${name}!",
    color = Color.White,
    modifier = Modifier
      .padding(vertical = 4.dp)
      .background(Color.DarkGray)
      .padding(4.dp),
    style = MaterialTheme.typography.body1
  )
}

@Composable
fun MultipleGreeting(names: List<String>) {
  val context = LocalContext.current

  Column(
    modifier = Modifier
      .background(Color.White)
      .padding(16.dp)
  ) {
    Image(
      painter = painterResource(id = R.drawable.header),
      contentDescription = null,
      modifier = Modifier
        .height(180.dp)
        .fillMaxWidth()
        .clip(RoundedCornerShape(32.dp)),
      contentScale = ContentScale.Crop
    )
    Spacer(modifier = Modifier.height(16.dp))
    Text(
      text = "Nombres que han ganado un premio en la tombola del barrio de al lado de mi casa:",
      style = MaterialTheme.typography.h6,
      maxLines = 2,
      overflow = Ellipsis
    )
    Spacer(modifier = Modifier.height(16.dp))
    names.forEach {
      Greeting(it)
    }
    Button(
      onClick = {
        Toast.makeText(context, "Button is clicked", Toast.LENGTH_LONG).show()
      },
      modifier = Modifier.align(End)
    ) {
      Text(text = "Leer Más")
    }
  }
}

@Preview
@Composable
fun Preview() {
  val names = listOf("Pepe", "Jose", "Pepillo")
  MultipleGreeting(names)
}