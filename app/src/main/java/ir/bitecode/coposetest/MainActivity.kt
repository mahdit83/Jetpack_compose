package ir.bitecode.coposetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.*
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.RectangleShape
import androidx.ui.layout.*
import androidx.ui.material.*
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import ir.bitecode.coposetest.ui.ComposeTestTheme
import ir.bitecode.coposetest.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                Greeting("Android")
                mahdisTest()
            }
        }
    }
}

@Composable
fun mahdisTest() {
    val image = imageResource(R.drawable.aaa)
    val imageModifier = Modifier.clip(RoundedCornerShape(10.dp)).fillMaxWidth()

    VerticalScroller {
        Column(modifier = Modifier.padding(50.dp)) {

            Spacer(Modifier.preferredHeight(5.dp).drawShadow(10.dp, shape = RectangleShape))
            Surface(color = Color.Yellow) {
                Text(text = "Surface text", modifier = Modifier.padding(14.dp))

            }
            Image(image, contentScale = ContentScale.Crop, modifier = imageModifier)
            Text(
                text = "Salam", style = typography.h6
            )
            Text(text = "Ahvalet")
            Divider(color = Color.Black)
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged."
            )
            Spacer(Modifier.preferredHeight(10.dp))
            Counter()
        }
    }


}

@Composable
fun Counter() {

    val count = state { 0 }
    val name = state { "Mahdi" }
    TextButton(onClick = { name.value = name.value + "i" }, modifier = Modifier.fillMaxWidth()) {
        Text(name.value)
    }

    Spacer(Modifier.preferredHeight(10.dp))

    /* Conditional color change by state */
    /* get theme color */
    Button(
        onClick = { count.value++ },
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = if (count.value % 2 == 0) Color.Green else MaterialTheme.colors.primary
    ) {
        Text("I've been clicked ${count.value} times")
    }
}


@Composable
@Preview(showBackground = true)
fun mahdisPreview() {
    Greeting("Android")
    mahdisTest()
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Greeting("Android")
    }
}