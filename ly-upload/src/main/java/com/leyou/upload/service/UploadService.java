package com.leyou.upload.service;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/31 14:46
 * @version:
 * @modified By:
 */
@Service
@Slf4j
public class UploadService {
    @Autowired
    private FastFileStorageClient storageClient;//文件上传最终地址
    private static final List<String> ALLOWTYPES = Arrays.asList("image/jpeg","image/jpg","image/png");

    public String uploadImage(MultipartFile file){
        try {
            //检验格式
            String contentType = file.getContentType();
            if(! ALLOWTYPES.contains(contentType)){
                throw new LyException(ExceptionEnum.CONTENT_TYPE_ERROE);
            }
            //检验内容
            BufferedImage read = ImageIO.read(file.getInputStream());
            if(read == null){
                throw new LyException(ExceptionEnum.INVALID_IMAGE_ERROE);
            }
            /*//准备目标路径
            File dest = new File("D:/javacode/idea/upload/", file.getOriginalFilename());
            //保存到本地
            file.transferTo(dest);*/
            //上传到FastDFS
            String s = StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
            StorePath storePath = storageClient.uploadFile(file.getInputStream(), file.getSize(), s, null);
            return "http://120.79.23.95/"+storePath.getFullPath();
        } catch (IOException e) {
            log.error("文件上传失败");
            throw new LyException(ExceptionEnum.UPLOAD_FAILED_ERROE);
        }
    }
}
