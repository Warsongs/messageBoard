package com.dongda.controller;

import com.dongda.entity.MessBoard;
import com.dongda.service.MsbdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/messboard")
public class MsbdController {
    @Autowired
    private MsbdService msbdService;
    @RequestMapping(value="list",method = RequestMethod.GET)
    @ResponseBody
    public List<MessBoard> list(){
        List<MessBoard> msbdList = msbdService.getMebdList();
        return msbdList;
    }



    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    private String upload(HttpServletRequest request, @RequestParam MultipartFile file, @RequestParam String user ) {
        if(file!=null){
            //获取文件的原始文件名
            String originalFilename = file.getOriginalFilename();
            //截取文件的后缀名
            String suffix = originalFilename.substring(originalFilename.lastIndexOf('.')+1);
            // 获取物理路径
            String targetDirectory = request.getSession().getServletContext().getRealPath("/uploads");

            //文件夹要写全，否则会报错java.io.FileNotFoundException
            //String targetDirectory = "D:\\JAVA\\apache-tomcat-7.0.82-windows-x64\\apache-tomcat-7.0.82\\webapps\\BookSystem\\upload";
            System.out.println("-----------------"+targetDirectory);

            try {
                InputStream input = file.getInputStream();
                //上传图片的存储位置，文件夹+当前时间+原后缀名拼接而成。
                String path=targetDirectory+new Date().getTime()+"."+suffix;
                File file1 = new File(path);
                byte[] buffer = new byte[1024*8];
                FileOutputStream fo = new FileOutputStream(file1);
                int i=0;
                while((i=input.read(buffer))!=-1){
                    fo.write(buffer);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(user + " ----------------------------->");

            return "success";
        }
        return "false";
    }

}
