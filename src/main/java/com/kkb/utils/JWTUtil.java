package com.kkb.utils;



import com.kkb.pojo.User;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * jwt工具类
 * @author wuhanwei
 * @version 1.0
 * @date 2021/10/28
 */
public class JWTUtil {

    // JWT使用的密钥,自定义, 不可泄漏, 作为jwt数字验证加密时加的盐
    public static final String sercetKey = "BSftz3q8uJqgpf";

    // Token过期时间: 1800000毫秒 : 30分钟
    public final static long keeptime = 1800000;

    // 存入payLoad的参数名
    public final static String payLoadUserId = "uId";
    public final static String payLoadLoginName = "loginName";
    public final static String payLoadRoleId = "rId";

    /**
     * 获取一个JWTToken
     * @param payLoadMap : 存入payLoad的数据
     * @return
     */
    public static String generToken(Map<String, Object> payLoadMap) {
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        // 使用Hash256算法进行加密
        long nowMillis = System.currentTimeMillis();
        Date now = new Date(nowMillis);
        // 获取系统时间以便设置token有效时间
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(sercetKey);
        // 将密钥转码为base64形式,再转为字节码
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
        // 对其使用Hash256进行加密
        JwtBuilder builder = Jwts.builder().setIssuedAt(now);
        // JWT生成类,此时设置iat,以及根据传入的id设置token
        if (payLoadMap != null) {
            builder.setClaims(payLoadMap);
        }
        builder.signWith(signatureAlgorithm, signingKey);
        // 进行签名,生成Signature
        long expMillis = nowMillis + keeptime;
        builder.setExpiration(new Date(expMillis));
        // 返回最终的token结果
        return builder.compact();
    }


    /**
     * 验证并更新token
     * @param token : 需要验证的token
     * @return
     */
    public static String updateToken(String token) {
        Map<String, Object> payLoadMap = new HashMap<>();
        // Claims就是包含了我们的Payload信息类
        Claims claims = verifyToken(token);
        // 获取payLoad中的uId, uLoginName, rId
        Object uId = claims.get(payLoadUserId);
        Object loginName = claims.get(payLoadLoginName);
        Object rId = claims.get(payLoadRoleId);
        payLoadMap.put(payLoadUserId, uId);
        payLoadMap.put(payLoadLoginName, loginName);
        payLoadMap.put(payLoadRoleId, rId);
        // 重新获取Token并返回
        return generToken(payLoadMap);
    }


    /**
     * 验证token
     * @param token : 需要验证的token
     * @return  : 有效则返回Claims, 包含了payLoad信息, 无效则抛出异常
     */
    public static Claims verifyToken(String token) {
        Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(sercetKey))
                .parseClaimsJws(token).getBody();
        return claims;
    }
}
