package com.wutsi.ecommerce.shipping.entity

import com.wutsi.ecommerce.order.entity.AddressType

enum class ShippingType(val addressType: AddressType?) {
    IN_STORE_PICKUP(null),
    LOCAL_PICKUP(AddressType.POSTAL),
    LOCAL_DELIVERY(AddressType.POSTAL),
    INTERNATIONAL_SHIPPING(AddressType.POSTAL),
    EMAIL_DELIVERY(AddressType.EMAIL)
}
