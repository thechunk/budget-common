package common.engine

import java.util.*

interface Producer {
    fun sendMessage(topic: String, key: String = UUID.randomUUID().toString(), message: ByteArray)
}