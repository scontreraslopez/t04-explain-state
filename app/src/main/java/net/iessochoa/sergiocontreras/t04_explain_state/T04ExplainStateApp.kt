package net.iessochoa.sergiocontreras.t04_explain_state

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.t04_explain_state.ui.T04ExplainStateScreen
import net.iessochoa.sergiocontreras.t04_explain_state.ui.theme.T04explainstateTheme

/**
 * Project: T04-explain-state
 * From: net.iessochoa.sergiocontreras.t04_explain_state.ui.theme
 * Created by: Contr
 * On: 13/10/2026 at 11:19
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun T04ExplainStateApp() {
    T04explainstateTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            T04ExplainStateScreen(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun T04ExplainStateAppPreview() = T04ExplainStateApp()