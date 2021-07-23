# Hands-On-Kafka
### simple kafka producer and consumer

#### *spin the kafka cluster*
```
docker-compose -f kafka.yml up
```

#### *produce a message*
```
uri: localhost:8080/users/produce
payload examle: 
{
    "name":"layth",
    "address":"jenin",
    "age":22
}
```

#### *find the consumer outputs in the console*


