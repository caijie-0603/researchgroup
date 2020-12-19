package com.fifth.researchgroup.controller;

import com.fifth.researchgroup.entity.FileResult;
import com.fifth.researchgroup.entity.User;
import com.fifth.researchgroup.entity.UserImage;
import com.fifth.researchgroup.service.ImageService;
import com.fifth.researchgroup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin
public class ImageController {
    @Autowired
    private ImageService imageService;

    @RequestMapping("/upload")
    public FileResult upload(int id,@RequestParam("picture") MultipartFile picture, HttpServletRequest request) {

        System.out.println(picture);
        //获取文件在服务器的储存位置
        String path = "E://researchgroup//headPortrait";
        File filePath = new File(path);
        System.out.println("文件的保存路径：" + path);
        if (!filePath.exists() && !filePath.isDirectory()) {
            System.out.println("目录不存在，创建目录:" + filePath);
            filePath.mkdir();
        }

        //获取原始文件名称(包含格式)
        String fileName = picture.getOriginalFilename();
        System.out.println("原始文件名称：" + fileName);

        //在指定路径下创建一个文件
        File targetFile = new File(path, fileName);

        //拼接图片地址
        String fileUrl = path + "//" +fileName;
        System.out.println("图片地址：" + fileUrl);
        //将文件保存到服务器指定位置
        try {
            picture.transferTo(targetFile);
            System.out.println("上传成功");
            UserImage userImage = new UserImage();

            userImage.setUserId(id);
            userImage.setImageUrl(fileName);

            int updateResult = imageService.updateImageUrl(userImage);
            System.out.println(updateResult);
            //将文件在服务器的存储路径返回
            return new FileResult(true, fileName, fileUrl);
        } catch (IOException e) {
            System.out.println("上传失败");
            e.printStackTrace();
            return new FileResult(false, "上传失败", "");
        }
    }
}
