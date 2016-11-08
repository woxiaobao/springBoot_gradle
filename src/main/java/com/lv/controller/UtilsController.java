package com.lv.controller;

import com.lv.utils.DesUtil;
import com.lv.utils.MD5Util;
import com.lv.utils.SHA1;
import lv.com.utils.domain.EncryptResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by LVBAOLIN on 2016/11/4.
 */
@RestController
public class UtilsController {

    protected static Logger logger= LoggerFactory.getLogger(UtilsController.class);


    @RequestMapping("/sha1/{str}")
    public EncryptResult sha1(@PathVariable(value = "str") String str) {
        //System.out.println("hello everyone!"+str);
        String digest = new SHA1().getDigestOfString(str.getBytes());
        logger.info("sha1:"+digest);
        return new EncryptResult(digest,"SHA1","success");
    }

    @RequestMapping("/md5/{str}")
    public EncryptResult md5(@PathVariable(value = "str") String str) {
        String digest = MD5Util.MD5Encode(str);
        logger.info("md5:"+digest);
        return new EncryptResult(digest,"MD5","success");
    }

    /**
     * DES加密
     * @param value
     * @return
     */
    @RequestMapping("desEncrypt")
    public EncryptResult desEncrypt(String value){
        logger.debug("desEncrypt=",value);
        String str = null;
        try {
            DesUtil des = new DesUtil();
            str = des.encrypt(value);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("desEncrypt happen error");
        }
        return new EncryptResult(str,"DES Encrypt","success");
    }


    @RequestMapping("desDecrypt")
    public EncryptResult desDecrypt(String value){
        logger.debug("desDecrypt=",value);
        String str = null;
        try {
            DesUtil des = new DesUtil();
            str = des.decrypt(value);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("desDecrypt happen error");
        }
        return new EncryptResult(str,"DES Decrypt","success");
    }
}
