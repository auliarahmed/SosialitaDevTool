package dev.code.sosialitadevtool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.code.sosialitadevtool.ui.theme.SosialitaDevToolTheme

class Menu : ComponentActivity() {

    val reeniebeanie = FontFamily(
        Font(R.font.reeniebeanie, FontWeight.Normal)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SosialitaDevToolTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(start = 16.dp, top = 32.dp, end = 16.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Text(
                                text = "SosiaLita\nToolkits",
                                textAlign = TextAlign.Center,
                                fontFamily = FontFamily.Cursive,
                                fontSize = 36.sp
                            )
                            Image(
                                painter = painterResource(R.drawable.logo_sosialita),
                                contentDescription = "Sosialita Logo",
                                modifier = Modifier
                                    .size(85.dp)
                            )
                        }
                        Column(modifier = Modifier.padding(top = 32.dp)) {
                            Row(modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .weight(1f)
                                ) {
                                    Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp){
                                        Column(horizontalAlignment = Alignment.CenterHorizontally){
                                            Image(
                                                painter = painterResource(R.drawable.web),
                                                contentDescription = "IC WEB PRODUKSI",
                                                modifier = Modifier
                                                    .size(85.dp)
                                                    .padding(top = 16.dp)
                                            )
                                            Text(text = "Web Produksi", modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                                        }
                                    }
                                }
                                Column(horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .width(200.dp)
                                        .weight(1f)
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.ic_web_dev),
                                        contentDescription = "IC WEB PRODUKSI",
                                        modifier = Modifier
                                            .size(85.dp)
                                            .padding(top = 16.dp)
                                    )
                                    Text(text = "Web Produksi", modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun TitleMenu(reeniebeanie: FontFamily) {
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
fun DefaultPreview3() {
    SosialitaDevToolTheme {
        Column(modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(start = 16.dp, top = 32.dp, end = 16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Text(
                    text = "SosiaLita\nToolkits",
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 36.sp
                )
                Image(
                    painter = painterResource(R.drawable.logo_sosialita),
                    contentDescription = "Sosialita Logo",
                    modifier = Modifier
                        .size(85.dp)
                )
            }
            Column(modifier = Modifier.padding(top = 32.dp)) {
                Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                    ) {
                        Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp){
                            Column(horizontalAlignment = Alignment.CenterHorizontally){
                                Image(
                                    painter = painterResource(R.drawable.web),
                                    contentDescription = "IC WEB PRODUKSI",
                                    modifier = Modifier
                                        .size(85.dp)
                                        .padding(top = 16.dp)
                                )
                                Text(text = "Web Produksi", modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                            }
                        }
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .width(200.dp)
                            .weight(1f)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.ic_web_dev),
                                contentDescription = "IC WEB PRODUKSI",
                                modifier = Modifier
                                    .size(85.dp)
                                    .padding(top = 16.dp)
                            )
                            Text(text = "Web Produksi", modifier = Modifier.padding(top = 16.dp, bottom = 16.dp))
                    }
                }
            }
        }
    }
}