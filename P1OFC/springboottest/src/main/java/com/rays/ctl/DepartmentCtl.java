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
import com.rays.dto.DepartmentDTO;
import com.rays.form.DepartmentForm;
import com.rays.service.DepartmentServiceInt;

@RestController
@RequestMapping(value = "Department")
public class DepartmentCtl extends BaseCtl<DepartmentForm, DepartmentDTO, DepartmentServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);

        HashMap<Integer, String> dnameMap = new HashMap<>();
        dnameMap.put(1, "Sales");
        dnameMap.put(2, "Marketing");
        dnameMap.put(3, "Finance");
        dnameMap.put(4, "HR");

        List<Map<String, Object>> dnameList = new ArrayList<>();
        dnameMap.forEach((key, value) -> {
            Map<String, Object> item = new HashMap<>();
            item.put("key", key);
            item.put("value", value);
            dnameList.add(item);
        });

        res.addResult("dnameList", dnameList);

        return res;
    }
}
