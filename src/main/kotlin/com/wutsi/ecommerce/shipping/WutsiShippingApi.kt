package com.wutsi.ecommerce.shipping

import com.wutsi.ecommerce.shipping.dto.CreateShippingRequest
import com.wutsi.ecommerce.shipping.dto.CreateShippingResponse
import com.wutsi.ecommerce.shipping.dto.GetShippingResponse
import com.wutsi.ecommerce.shipping.dto.ListShippingResponse
import com.wutsi.ecommerce.shipping.dto.SearchRateRequest
import com.wutsi.ecommerce.shipping.dto.SearchRateResponse
import com.wutsi.ecommerce.shipping.dto.UpdateShippingAttributeRequest
import feign.Headers
import feign.Param
import feign.RequestLine
import kotlin.Long
import kotlin.String
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

  @RequestLine("POST /v1/shippings/{id}/attributes/{name}")
  @Headers(value=["Content-Type: application/json"])
  public fun updateShippingAttribute(
    @Param("id") id: Long,
    @Param("name") name: String,
    request: UpdateShippingAttributeRequest
  ): Unit

  @RequestLine("POST /v1/rates/search")
  @Headers(value=["Content-Type: application/json"])
  public fun searchRate(request: SearchRateRequest): SearchRateResponse
}
