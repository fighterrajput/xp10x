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
import com.rays.dto.StockAnalysisDTO;
import com.rays.form.StockAnalysisForm;
import com.rays.service.StockAnalysisServiceInt;

@RestController
@RequestMapping(value = "StockAnalysis")
public class StockAnalysisCtl extends BaseCtl<StockAnalysisForm, StockAnalysisDTO, StockAnalysisServiceInt> {

    @GetMapping("/preload")
    public ORSResponse preload() {
        ORSResponse res = new ORSResponse(true);

        HashMap<Integer, String> analysisMap = new HashMap<>();
        analysisMap.put(1, "Fundamental");
        analysisMap.put(2, "Technical");
       

        List<Map<String, Object>> analysisList = new ArrayList<>();
        analysisMap.forEach((key, value) -> {
            Map<String, Object> item = new HashMap<>();
            item.put("key", key);
            item.put("value", value);
            analysisList.add(item);
        });

        res.addResult("analysisList", analysisList);

        return res;
    }
}
