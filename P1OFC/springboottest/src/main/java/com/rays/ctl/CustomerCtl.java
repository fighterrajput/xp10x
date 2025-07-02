package com.rays.ctl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CustomerDTO;
import com.rays.form.CustomerForm;
import com.rays.service.CustomerServiceInt;

@RestController
@RequestMapping(value = "Customer")
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);

        HashMap<Integer, String> nameMap = new HashMap<>();
        nameMap.put(1, "Online");
        nameMap.put(2, "Offline");
        nameMap.put(3,"both");
       

        List<Map<String, Object>> productList = new ArrayList<>();
        nameMap.forEach((key, value) -> {
            Map<String, Object> item = new HashMap<>();
            item.put("key", key);
            item.put("value", value);
            productList.add(item);
        });

        res.addResult("productList", productList);

        return res;
    }
}