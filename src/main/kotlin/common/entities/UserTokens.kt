package common.entities

import java.io.Serializable

class UserTokens(
    val google: ClientTokens? = null
) : Serializable