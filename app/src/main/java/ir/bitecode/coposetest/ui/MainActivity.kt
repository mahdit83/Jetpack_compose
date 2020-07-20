package ir.bitecode.coposetest.ui

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
import ir.bitecode.coposetest.R
import ir.bitecode.coposetest.data.AppContainer
import ir.bitecode.coposetest.data.AppContainerImpl
import ir.bitecode.coposetest.ui.*

class MainActivity : AppCompatActivity() {

    val container: AppContainer by lazy{
        AppContainerImpl(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        setContent {
            StartMyApp(container)
        }
    }
}

