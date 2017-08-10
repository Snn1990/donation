package com.yzf.controller;

import com.yzf.dao.DonationInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nan on 2017/8/10.
 */
@RestController
public class PublicController {

    @Autowired
    private DonationInfoRepository donationInfoRepository;
    @GetMapping(value = "test")
    public String test(){
        donationInfoRepository.findAll();
        return "success";
    }
}
