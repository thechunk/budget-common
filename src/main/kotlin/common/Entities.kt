package common

import java.io.Serializable
import java.math.BigDecimal
import java.util.*

class MessageRequest

class Amount(
    var value: BigDecimal,
    var currency: Currency = Currency.getInstance("HKD")
) : Serializable

class BudgetRecord(
    var description: String,
    var amount: Amount,
    var paymentMethod: String,
    var category: String
) : Serializable
