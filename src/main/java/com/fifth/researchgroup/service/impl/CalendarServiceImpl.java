package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.CalendarDao;
import com.fifth.researchgroup.entity.Calendar;
import com.fifth.researchgroup.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CalendarServiceImpl implements CalendarService {

    @Autowired
    private CalendarDao calendarDao;
    @Override
    public int addCalendar(Calendar calendar) {
        return calendarDao.addCalendar(calendar);
    }

    public int deleteCalendar(int id){
        return calendarDao.deleteCalendar(id);
    }

    @Override
    public List<Calendar> searchCalendarsBySendTime(String time) {
        return calendarDao.searchCalendarsBySendTime(time);
    }
}
