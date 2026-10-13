package net.iessochoa.sergiocontreras.t04_explain_state.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.t04_explain_state.ui.theme.T04explainstateTheme

/**
 * Project: T04-explain-state
 * From: net.iessochoa.sergiocontreras.t04_explain_state.ui.theme
 * Created by: Contr
 * On: 13/10/2026 at 11:20
 * Creado en Settings -> Editor -> File and Code Templates
 */


@Composable
fun T04ExplainStateScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        Saludo()
        Spacer(modifier = Modifier.padding(32.dp))
        ContadorAgua()
    }
}

@Composable
fun Saludo(modifier: Modifier = Modifier) {
    TextField(
        value = "",
        onValueChange = { },
        label = { Text("Nombre") },
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun T04ExplainStateScreenPreview() {
    T04explainstateTheme {
        Saludo()
    }
}

@Composable
fun ContadorAgua(modifier: Modifier = Modifier) {
    var count = 0
    Column(modifier = modifier.padding(16.dp)) {
        Text("Te has bebido $count vasos.")
        Button(onClick = {
            count++
            Log.d("ContadorAgua", "Botón pulsado: count = $count")
        }) {
            Text("Añadir uno")
        }
    }
}