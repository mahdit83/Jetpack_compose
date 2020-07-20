package ir.bitecode.coposetest.ui.home

import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.drawShadow
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.RectangleShape
import androidx.ui.layout.*
import androidx.ui.material.Divider
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import ir.bitecode.coposetest.R
import ir.bitecode.coposetest.data.products.ProductRepository
import ir.bitecode.coposetest.models.ProductModel
import ir.bitecode.coposetest.ui.typography


@Composable
fun HomeScreen(
    productRepository: ProductRepository
) {

//    productRepository.getProducts {
//
//        if (it is Result.Success) {


    val result = listOf(
        ProductModel("dragon ball 1", 4, R.drawable.product_1),
        ProductModel("Dragon ball z", 45, R.drawable.product_2),
        ProductModel("Puprpet man", 12, R.drawable.product_3),
        ProductModel("Niyoi bow", 5, R.drawable.product_4),
        ProductModel("Dragon ball SD", 12, R.drawable.product_5),
        ProductModel("Buroli", 9, R.drawable.product_6),
        ProductModel("dragon ball 2", 110, R.drawable.product_6)
    )

    val imageModifier = Modifier.clip(RoundedCornerShape(10.dp)).fillMaxWidth()


    VerticalScroller {
        result.forEach { product ->
            Column(modifier = Modifier.padding(50.dp)) {

                Spacer(
                    Modifier.preferredHeight(5.dp).drawShadow(10.dp, shape = RectangleShape)
                )
                Surface(color = Color.Yellow) {
                    Text(text = product.name, modifier = Modifier.padding(14.dp))

                }
                Image(
                    imageResource(id = product.imageResource),
                    contentScale = ContentScale.Crop,
                    modifier = imageModifier
                )
                Text(
                    text = product.quantity.toString(), style = typography.h6
                )
                Divider(color = Color.Black)
                Spacer(Modifier.preferredHeight(10.dp))
            }
        }

    }


}

