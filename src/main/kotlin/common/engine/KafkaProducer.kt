package common.engine

import org.slf4j.LoggerFactory
import org.springframework.kafka.core.KafkaTemplate

open class KafkaProducer(private val kafkaTemplate: KafkaTemplate<String, ByteArray>) : Producer {
    private val logger = LoggerFactory.getLogger(KafkaProducer::class.java)!!

    override fun sendMessage(topic: String, key: String, message: ByteArray) {
        logger.debug("Send: $key to $topic")
        kafkaTemplate.send(topic, key, message)
    }
}