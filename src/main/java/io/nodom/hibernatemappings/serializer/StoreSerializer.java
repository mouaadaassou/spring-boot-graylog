package io.nodom.hibernatemappings.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import io.nodom.hibernatemappings.dto.StoreDTO;
import io.nodom.hibernatemappings.model.Product;
import io.nodom.hibernatemappings.model.Store;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;


@NoArgsConstructor
public class StoreSerializer extends JsonSerializer<Collection<Store>> {

//    public StoreSerializer() {
//        this(null);
//    }

//    public StoreSerializer(Class<Collection<Store>> t) {
//        super(t);
//    }

    @Override
    public void serialize(Collection<Store> storeList,
                          JsonGenerator jGen,
                          SerializerProvider serializerProvider) throws IOException {
        Collection<Long> stores = new ArrayList<>();
        for (Store store : storeList) {
            stores.add(store.getId());
        }
        jGen.writeObject(stores);
    }
}