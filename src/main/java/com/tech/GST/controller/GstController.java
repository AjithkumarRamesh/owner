package com.tech.GST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.GST.entity.GST;
import com.tech.GST.service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gstser;

	@PostMapping(value = "/setGst")
	public String setGst(@RequestBody GST g) {
		return gstser.setgst(g);
	}

	@PostMapping(value = "/setAllGst")
	public String setAllGst(@RequestBody List<GST> g) {
		return gstser.setAllGst(g);
	}

	@GetMapping(value = "/getGstId")
	public GST getGstId(@RequestParam int id) {
		return gstser.getGstId(id);
	}

	@GetMapping(value = "/getAllGstId")
	public List<GST> getAllGstId() {
		return gstser.getAllGstId();
	}
	@GetMapping(value="/getTaxByHns/{hns}")
	public int getTaxByHns(@PathVariable int hns){
		return gstser.getTaxByHns(hns);
	}

}
