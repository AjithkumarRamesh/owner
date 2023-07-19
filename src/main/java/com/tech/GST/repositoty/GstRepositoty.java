package com.tech.GST.repositoty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tech.GST.entity.GST;

public interface GstRepositoty extends JpaRepository<GST, Integer> {
	@Query(value="select tax_percentage from gst where hns=?",nativeQuery = true)
	public int getTaxByHns(int hns);

}
