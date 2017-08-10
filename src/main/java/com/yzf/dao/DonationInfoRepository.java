package com.yzf.dao;

import com.yzf.po.DonationInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by nan on 2017/8/10.
 */
@Component
public interface DonationInfoRepository extends JpaRepository<DonationInfo,Integer>{
}
