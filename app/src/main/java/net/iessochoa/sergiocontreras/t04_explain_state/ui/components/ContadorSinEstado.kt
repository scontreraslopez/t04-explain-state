package net.iessochoa.sergiocontreras.t04_explain_state.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Project: T04-explain-state
 * From: net.iessochoa.sergiocontreras.t04_explain_state.ui.components
 * Created by: Contr
 * On: 13/10/2026 at 12:06
 * Creado en Settings -> Editor -> File and Code Templates
 */

// Sin estado: solo muestra y avisa
@Composable
fun ContadorSinEstado(
    count: Int,
    flavor: String = "agua",
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("Llevas $count vasos de $flavor")
        }
        Button(onClick = onIncrement, enabled = count < 10) {
            Text("Añadir uno")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorSinEstadoPreview() {
    ContadorSinEstado(count = 2, flavor = "agua", onIncrement = {})
}