# rabbitmq-with-java-spring-boot
RabbitMQ with spring boot. 

# Run Rabbit MQ Container
```shell
cd producer/src/main/resources && docker-compose up -d
```
| service | port |
|--|--|
| producer-service | 5000 |
| consumer-service | 5001 |

# Test Send Message
```shell
curl --location --request POST 'http://localhost:5000/producer/send' \
--header 'Content-Type: application/json' \
--data-raw '{
    "message": "Notification Message Body",
    "messageType": "Message Type"
}'
