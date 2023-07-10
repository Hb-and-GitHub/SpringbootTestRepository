package com.hb.demo.service.impl;

import com.hb.demo.service.helloService;
import org.springframework.stereotype.Service;

@Service
public class helloImpl implements helloService {

    @Override
    public String helloCon() {
        return "helloworld";
    }

}
