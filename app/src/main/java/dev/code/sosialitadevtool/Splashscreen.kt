package dev.code.sosialitadevtool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.code.sosialitadevtool.ui.theme.SosialitaDevToolTheme
import org.intellij.lang.annotations.JdkConstants

class Splashscreen : ComponentActivity() {

    val reeniebeanie = FontFamily(
        Font(R.font.reeniebeanie, FontWeight.Normal)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SosialitaDevToolTheme {
                Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Row() {
                        Image(
                            painter = painterResource(R.drawable.logo_sosialita),
                            contentDescription = "Sosialita Logo",
                            modifier = Modifier.size(80.dp))

                        Spacer(modifier = Modifier.width(8.dp))

                        Image(
                            painter = painterResource(R.drawable.ic_toolkit),
                            contentDescription = "Toolkit Logo",
                            modifier = Modifier.size(80.dp))
                    }
                    Title(reeniebeanie)
                }
            }
        }
    }
}

@Composable
fun Title(reeniebeanie: FontFamily) {
    Text(
        text = "SosiaLita\nToolkits",
        textAlign = TextAlign.Center,
        fontFamily = reeniebeanie,
        fontWeight = FontWeight.Normal,
        fontSize = 36.sp,
        modifier = Modifier.padding(16.dp))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    SosialitaDevToolTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Image(
                    painter = painterResource(R.drawable.logo_sosialita),
                    contentDescription = "Sosialita Logo",
                    modifier = Modifier.size(80.dp))

                Spacer(modifier = Modifier.width(8.dp))

                Image(
                    painter = painterResource(R.drawable.ic_toolkit),
                    contentDescription = "Toolkit Logo",
                    modifier = Modifier.size(80.dp))
            }
            Text(
                text = "SosiaLita\nToolkits",
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive,
                fontSize = 36.sp,
                modifier = Modifier.padding(16.dp))

        }
    }
}