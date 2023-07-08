package com.itself.example.supplier.opt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *  <p>https://mp.weixin.qq.com/s/uxl14x3EY_fUiHSlp-lCGA</p>
 */
@RestController
public class GrantTypeController {

    @Autowired
    private QueryGrantTypeService queryGrantTypeService;

    @GetMapping("/grantType/{key}/{value}")
    public String test(@PathVariable String key,@PathVariable String value){
        return queryGrantTypeService.getResult(key,value);
    }
}