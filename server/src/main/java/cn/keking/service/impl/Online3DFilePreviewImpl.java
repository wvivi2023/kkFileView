package cn.keking.service.impl;

import cn.keking.model.FileAttribute;
import cn.keking.service.FilePreview;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by kl on 2018/1/17.
 * Content :图片文件处理
 */
@Service
public class Online3DFilePreviewImpl implements FilePreview {

    private final CommonPreviewImpl commonPreview;

    public Online3DFilePreviewImpl(CommonPreviewImpl commonPreview) {
        this.commonPreview = commonPreview;
    }

    @Override
    public String filePreviewHandle(String url, Model model, FileAttribute fileAttribute) {
        commonPreview.filePreviewHandle(url,model,fileAttribute);
        return ONLINE3D_PREVIEW_PAGE;
    }

    @Override
    public String fileConvert(String url, Model model, FileAttribute fileAttribute){
        this.filePreviewHandle(url, model, fileAttribute);
        return "转换成功";
    }
}
