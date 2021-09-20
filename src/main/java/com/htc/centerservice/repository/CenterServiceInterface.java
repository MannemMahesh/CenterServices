package com.htc.centerservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htc.centerservicce.entity.CenterServiceEntity;




@Repository

public interface CenterServiceInterface  extends  JpaRepository<CenterServiceEntity,Long> {
	
	@Query(value="SELECT centre_id,centre_address,pin_code,scheduled_date_time FROM Centre_Service WHERE pin_code=?1",nativeQuery = true)
	public List<CenterServiceEntity> findByPin_code(Long pin_code);

}
