package ir.bitecode.coposetest.data.products

import ir.bitecode.coposetest.R
import ir.bitecode.coposetest.data.Result
import ir.bitecode.coposetest.models.ProductModel


class ProductFakeRepository : ProductRepository {


    val products = listOf(

        ProductModel("dragon ball 1" ,4 , R.drawable.product_1) ,
        ProductModel("Dragon ball z" ,45 , R.drawable.product_2) ,
        ProductModel("Puprpet man" ,12 , R.drawable.product_3) ,
        ProductModel("Niyoi bow" ,5 , R.drawable.product_4) ,
        ProductModel("Dragon ball SD" ,12 , R.drawable.product_5) ,
        ProductModel("Buroli" ,9 , R.drawable.product_6) ,
        ProductModel("dragon ball 2" ,110 , R.drawable.product_7)

    )


    override fun getProducts(callback: (ir.bitecode.coposetest.data.Result<List<ProductModel>>) -> Unit) {
        callback(Result.Success(products))
    }
}