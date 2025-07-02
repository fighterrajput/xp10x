package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ItemInformationDTO;
import com.rays.form.ItemInformationForm;
import com.rays.service.ItemInformationServiceInt;

@RestController
@RequestMapping(value = "ItemInformation")
public class ItemInformationCtl extends BaseCtl<ItemInformationForm, ItemInformationDTO, ItemInformationServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Electronics");
		map.put(2, "Cloths");
		map.put(3, "Glasses");

		res.addResult("ItemInformationList", map);
		return res;
	}

}
