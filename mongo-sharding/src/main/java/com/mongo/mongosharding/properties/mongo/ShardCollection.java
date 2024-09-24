package com.mongo.mongosharding.properties.mongo;
import lombok.Data;
@Data
public class ShardCollection {
    private String collection;
    private String shardField;
}