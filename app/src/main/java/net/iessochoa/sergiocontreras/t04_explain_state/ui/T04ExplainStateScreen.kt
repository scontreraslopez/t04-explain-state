package net.iessochoa.sergiocontreras.t04_explain_state.ui

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
    Saludo(modifier)
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