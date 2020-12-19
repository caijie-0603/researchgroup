package com.fifth.researchgroup.service.impl;

import com.fifth.researchgroup.dao.ImageDao;
import com.fifth.researchgroup.entity.UserImage;
import com.fifth.researchgroup.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;
    @Override
    public int updateImageUrl(UserImage userImage) {
        return imageDao.updateImageUrl(userImage);
    }
}
