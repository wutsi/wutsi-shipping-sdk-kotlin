package com.wutsi.ecommerce.shipping

import com.wutsi.ecommerce.shipping.dto.CreateShippingRequest
import com.wutsi.ecommerce.shipping.dto.CreateShippingResponse
import com.wutsi.ecommerce.shipping.dto.GetShippingResponse
import com.wutsi.ecommerce.shipping.dto.ListShippingResponse
import com.wutsi.ecommerce.shipping.dto.SaveRateRequest
import com.wutsi.ecommerce.shipping.dto.UpdateShippingRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.Unit

public interface WutsiShippingApi {
  @RequestLine("GET /v1/shippings")
  @Headers(value=["Content-Type: application/json"])
  public fun listShipping(): ListShippingResponse

  @RequestLine("POST /v1/shippings")
  @Headers(value=["Content-Type: application/json"])
  public fun createShipping(request: CreateShippingRequest): CreateShippingResponse

  @RequestLine("GET /v1/shippings/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getShipping(@Param("id") id: Long): GetShippingResponse

  @RequestLine("POST /v1/shippings/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateShipping(@Param("id") id: Long, request: UpdateShippingRequest): Unit

  @RequestLine("POST /v1/rates")
  @Headers(value=["Content-Type: application/json"])
  public fun saveRate(request: SaveRateRequest): Unit

  @RequestLine("DELETE /v1/rates/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun deleteRate(@Param("id") id: Long): Unit
}
