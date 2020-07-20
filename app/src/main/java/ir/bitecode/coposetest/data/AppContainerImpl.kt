/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ir.bitecode.coposetest.data



import android.content.Context
import android.os.Handler
import android.os.Looper

import ir.bitecode.coposetest.data.products.ProductFakeRepository
import ir.bitecode.coposetest.data.products.ProductRepository
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * Dependency Injection container at the application level.
 */
interface AppContainer {
    val productRepository: ProductRepository
}

/**
 * Implementation for the Dependency Injection container at the application level.
 *
 * Variables are initialized lazily and the same instance is shared across the whole app.
 */
class AppContainerImpl(private val applicationContext: Context) : AppContainer {

    private val executorService: ExecutorService by lazy {
        Executors.newFixedThreadPool(4)
    }

    private val mainThreadHandler: Handler by lazy {
        Handler(Looper.getMainLooper())
    }
    override val productRepository: ProductRepository by lazy {
        ProductFakeRepository()
    }


}
