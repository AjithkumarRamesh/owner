package com.tech.GST.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.GST.entity.GST;
import com.tech.GST.repositoty.GstRepositoty;

@Repository
public class GstDao {
	@Autowired
	GstRepositoty gstRepo;

	public String setgst(GST g) {
		gstRepo.save(g);
		return "Successfully saved";
	}

	public String setAllGst(List<GST> g) {
		gstRepo.saveAll(g);
		return "Successfully saved All";
	}

	public List<GST> getAllGstId() {
		return gstRepo.findAll();
	}

	public GST getGstId(int id) {
		return gstRepo.findById(id).get();
	}
	public int getTaxByHns(int hns) {
		return gstRepo.getTaxByHns(hns);
	}
	
}
