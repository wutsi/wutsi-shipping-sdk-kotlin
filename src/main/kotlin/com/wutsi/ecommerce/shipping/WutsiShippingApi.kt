package com.wutsi.ecommerce.shipping

import com.wutsi.ecommerce.shipping.dto.ChangeStatusRequest
import com.wutsi.ecommerce.shipping.dto.CreateShippingOrderRequest
import com.wutsi.ecommerce.shipping.dto.CreateShippingOrderResponse
import com.wutsi.ecommerce.shipping.dto.CreateShippingRequest
import com.wutsi.ecommerce.shipping.dto.CreateShippingResponse
import com.wutsi.ecommerce.shipping.dto.GetShippingOrderResponse
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

  @RequestLine("POST /v1/shipping-orders")
  @Headers(value=["Content-Type: application/json"])
  public fun createShippingOrder(request: CreateShippingOrderRequest): CreateShippingOrderResponse

  @RequestLine("GET /v1/shipping-orders/{id}")
  @Headers(value=["Content-Type: application/json"])
  public fun getShippingOrder(@Param("id") id: Long): GetShippingOrderResponse

  @RequestLine("POST /v1/shipping-orders/{id}/status")
  @Headers(value=["Content-Type: application/json"])
  public fun changeShippingOrderStatus(@Param("id") id: Long, request: ChangeStatusRequest): Unit
}
