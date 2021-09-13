package dev.code.sosialitadevtool

import android.content.res.Configuration
import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.code.sosialitadevtool.ui.theme.SosialitaDevToolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SosialitaDevToolTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Row {
                        Image(
                            painter = painterResource(R.drawable.ic_mobile_dev),
                            contentDescription = "API",
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape)
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Column {
                            Title("Title ini yak!")

                            Spacer(modifier = Modifier.height(4.dp))

                            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp){
                                Body("Body ini yak!")
                            }
                        }
                    }
                }
            }
        }
    }
}

// ------ Component ------

@Composable
fun Title(name: String) {
    Text(
        text = "Hello $name!",
        color = MaterialTheme.colors.secondaryVariant,
        style = MaterialTheme.typography.subtitle1
    )
}

@Composable
fun Body(name: String) {
    Text(
        text = "Hello $name!",
        style = MaterialTheme.typography.body1,
        textAlign = TextAlign.Center,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier.background(MaterialTheme.colors.secondary).padding(all = 10.dp)
    )
}

// ------ Preview Mode ------

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    showBackground = true,
    name = "Light Mode"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    showBackground = true,
    name = "Dark Mode"
)

@Composable
fun DefaultPreview() {
    SosialitaDevToolTheme {
        Surface(color = MaterialTheme.colors.background) {
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Image(
                    painter = painterResource(R.drawable.ic_mobile_dev),
                    contentDescription = "API",
                    modifier = Modifier
                        .size(40.dp)
                        .clip(CircleShape)
                        .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape),
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {
                    Title("Title ini yak awdawdaw!")

                    Spacer(modifier = Modifier.height(4.dp))

                    Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp){
                        Body("Body ini yak!")
                    }

                }
            }
        }
    }
}