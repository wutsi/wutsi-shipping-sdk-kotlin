package com.wutsi.ecommerce.shipping

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-shipping-server-test.herokuapp.com"),
  PRODUCTION("https://wutsi-shipping-server-prod.herokuapp.com"),
  ;
}
