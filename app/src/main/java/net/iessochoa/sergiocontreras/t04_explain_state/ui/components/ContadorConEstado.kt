package net.iessochoa.sergiocontreras.t04_explain_state.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Project: T04-explain-state
 * From: net.iessochoa.sergiocontreras.t04_explain_state.ui.components
 * Created by: Contr
 * On: 13/10/2026 at 12:06
 * Creado en Settings -> Editor -> File and Code Templates
 */

// Con estado: guarda los datos y reutiliza el anterior
@Composable
fun ContadorConEstado(modifier: Modifier = Modifier) {
    var vasosAgua by rememberSaveable { mutableIntStateOf(0) }
    var vasosZumo by rememberSaveable { mutableIntStateOf(0) }
    Column(modifier = modifier) {
        ContadorSinEstado(count = vasosAgua, flavor = "agua", onIncrement = { vasosAgua++ })
        ContadorSinEstado(count = vasosZumo, flavor = "zumo", onIncrement = { vasosZumo++ })
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorConEstadoPreview() = ContadorConEstado()