package com.example.springmongodb.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class DateResponse {
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date startDate1;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date endDate1;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date startDate2;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date endDate2;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date startDate3;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date endDate3;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date startDate4;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date endDate4;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date startDate5;
    @JsonFormat(pattern = "dd-MM-yyyy",shape = JsonFormat.Shape.STRING)
    private java.util.Date endDate5;
}
