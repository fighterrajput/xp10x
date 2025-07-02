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
import com.rays.dto.ClientDTO;
import com.rays.form.ClientForm;
import com.rays.service.ClientServiceInt;

@RestController
@RequestMapping(value = "Client")
public class ClientCtl extends BaseCtl<ClientForm, ClientDTO, ClientServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> illnessMap = new HashMap<>();
		illnessMap.put(1, "Dengue");
		illnessMap.put(2, "Cold");
		illnessMap.put(3, "Typhoid");

		List<Map<String, Object>> illnessList = new ArrayList<>();
		illnessMap.forEach((key, value) -> {
			Map<String, Object> item = new HashMap<>();
			item.put("key", key);
			item.put("value", value);
			illnessList.add(item);
		});

		res.addResult("illnessList", illnessList);

		return res;
	}
}