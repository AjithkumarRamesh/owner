package com.tech.GST.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.GST.dao.GstDao;
import com.tech.GST.entity.GST;

@Service
public class GstService {
	@Autowired
	GstDao gstdao;

	public String setgst(GST g) {
		return gstdao.setgst(g);
	}

	public String setAllGst(List<GST> g) {
		return gstdao.setAllGst(g);
	}

	public GST getGstId(int id) {
		return gstdao.getGstId(id);
	}

	public List<GST> getAllGstId() {
		return gstdao.getAllGstId();
	}
	public int getTaxByHns(int hns) {
		return gstdao.getTaxByHns(hns);
		
	}

}
