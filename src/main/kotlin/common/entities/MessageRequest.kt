package common.entities

import java.io.Serializable

class MessageRequest(
    val record: BudgetRecord,
    val tokens: UserTokens? = null
) : Serializable