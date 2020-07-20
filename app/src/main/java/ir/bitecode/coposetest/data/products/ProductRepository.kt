package ir.bitecode.coposetest.data.products

import ir.bitecode.coposetest.models.ProductModel

interface ProductRepository {

    fun getProducts(callback: (ir.bitecode.coposetest.data.Result<List<ProductModel>>) -> Unit)

}