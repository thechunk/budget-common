package common.entities

import java.math.BigDecimal
import java.util.*
import java.io.Serializable

class Amount(
    var value: BigDecimal,
    var currency: Currency = Currency.getInstance("HKD")
) : Serializable
