package common.entities

import java.io.Serializable
import java.time.Instant

class ClientTokens(
    val accessToken: String,
    val expiresAt: Instant?,
    val refreshToken: String
) : Serializable
