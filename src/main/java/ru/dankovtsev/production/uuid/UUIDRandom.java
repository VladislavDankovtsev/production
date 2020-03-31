package ru.dankovtsev.production.uuid;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UUIDRandom {
    public UUID randomkey() {
        UUID uuid = UUID.randomUUID();
        //String randomUUIDString = uuid.toString();
        //System.out.println("UUID=" + randomUUIDString );
        return uuid;
    }
}
