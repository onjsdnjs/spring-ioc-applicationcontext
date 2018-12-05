package io.anymobi.springiocapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sington {

    @Autowired
    Proto proto;

    public Proto getProto() {
        return proto;
    }
}
