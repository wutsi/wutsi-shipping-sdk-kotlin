package com.wutsi.ecommerce.shipping.dto

import kotlin.Int
import kotlin.Long
import kotlin.String

public data class Product(
  public val productId: Long = 0,
  public val productType: String = "",
  public val quantity: Int = 0
)
