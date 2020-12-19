package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Calendar {
    private int id;
    private int userId;
    private String userName;
    private String content;
    private Date sendTime;
    private String time;
}
