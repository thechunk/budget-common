package common.engine

import org.apache.kafka.clients.consumer.ConsumerRecord

interface Consumer {
    fun getMessage(record: ConsumerRecord<String, ByteArray>)
}