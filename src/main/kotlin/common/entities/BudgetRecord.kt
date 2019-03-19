package common.entities

import java.io.Serializable

class BudgetRecord(
    var description: String,
    var amount: Amount,
    var paymentMethod: String,
    var category: String
) : Serializable
