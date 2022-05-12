package com.example.springmongodb.service;

import com.example.springmongodb.dto.DateResponse;
import com.example.springmongodb.entity.Date;
import com.example.springmongodb.repository.DateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DateService {
    @Autowired
    private DateRepository dateRepository;

    public List<DateResponse> getDate() {
        List<Date> dates=dateRepository.findAll();
        List<DateResponse> dateResponses = new ArrayList<DateResponse>();
        dates.stream().forEach(date -> {
            java.util.Date s1 = date.getStartDate1();
            java.util.Date e1 = date.getEndDate1();
            java.util.Date s2 = date.getStartDate2();
            java.util.Date e2 = date.getEndDate2();
            java.util.Date s3 = date.getStartDate3();
            java.util.Date e3 = date.getEndDate3();
            java.util.Date s4 = date.getStartDate4();
            java.util.Date e4 = date.getEndDate4();
            java.util.Date s5 = date.getStartDate5();
            java.util.Date e5 = date.getEndDate5();
            DateResponse dateResponse=new DateResponse();
            if(s1.after(s5) && e1.before(e5)) {
                dateResponse.setStartDate1(s5);
                dateResponse.setEndDate1(s1);
            }
            if(s2.before(e1)) {
                dateResponse.setStartDate2(s2);
                dateResponse.setEndDate2(e1);
            }
            if(s3.before(e2)) {
                dateResponse.setStartDate3(s3);
                dateResponse.setEndDate3(e2);
            }
            if(e3.before(s4)) {
                dateResponse.setStartDate4(e3);
                dateResponse.setEndDate4(s4);
            }
            if(s4.after(s5) && e4.before(e5)) {
                dateResponse.setStartDate5(e4);
                dateResponse.setEndDate5(e5);
            }
            dateResponses.add(dateResponse);
        });
        return dateResponses;
    }
}
