package com.wutsi.ecommerce.shipping.dto

import kotlin.Long
import kotlin.String
import kotlin.collections.List

public data class SearchRateRequest(
  public val shippingId: Long? = null,
  public val accountId: Long = 0,
  public val country: String = "",
  public val cityId: Long? = null,
  public val products: List<Product> = emptyList()
)
