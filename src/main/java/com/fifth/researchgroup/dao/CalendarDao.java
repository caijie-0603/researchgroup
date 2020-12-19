package com.fifth.researchgroup.dao;

import com.fifth.researchgroup.entity.Calendar;

import java.util.Date;
import java.util.List;

public interface CalendarDao {
    public int addCalendar(Calendar calendar);      //新增个人工作日历
    public int deleteCalendar(int id);              //删除个人工作日历
    public List<Calendar> searchCalendarsBySendTime(String time);     //根据时间查询工作日历

}
