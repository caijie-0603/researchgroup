package com.fifth.researchgroup.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
public class UserImage {
    private int userId;
    private String imageUrl;
}
