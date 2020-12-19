package com.fifth.researchgroup.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fifth.researchgroup.entity.Calendar;
import com.fifth.researchgroup.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
public class CalendarController {

    @Autowired
    private CalendarService calendarService;

    @PostMapping("/calendar/addCalendar")
    public int addCalendar(@RequestBody Calendar calendar){
        return calendarService.addCalendar(calendar);
    }

    @DeleteMapping("/calendar/deleteCalendar")
    public int deleteCalendar(@RequestBody String id){
        return calendarService.deleteCalendar(Integer.parseInt(id));
    }

    @GetMapping("/calendar/searchCalendarByTime")
    public List<Calendar> searchCalendarsBySendTime(String time){
        return calendarService.searchCalendarsBySendTime(time);
    }
}
