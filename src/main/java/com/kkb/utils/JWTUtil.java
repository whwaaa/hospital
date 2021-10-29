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

    public static void main(String[] args) {

        // TODO: 需要从数据库中获取用户id, 用户名
        String u_id = "1";
        Map<String, Object> payLoadMap = new HashMap<>();
        payLoadMap.put("u_loginName", "小明");
        payLoadMap.put("u_id", u_id);
        String JWTToken = JWTUtil.generToken(payLoadMap);
        System.out.println(JWTToken);

//        String JWTToken = "eyJhbGciOiJIUzI1NiJ9.eyJ1X2xvZ2luTmFtZSI6IuWwj-aYjiIsImV4cCI6MTYzNTQwMTIyMn0.mBwwfbP8mwp6D3bq9X-zeZWlr_l6hW_bz4o09BtgxX8";

        Claims claims = verifyToken(JWTToken);
        if(claims != null){
            System.out.println("验证成功");
            Object u_loginName = claims.get("u_loginName");
            String id = claims.getId();
            System.out.println("u_loginName : " + u_loginName);
            System.out.println("id + " + id);
        }else{
            System.out.println("验证失败");
        }

    }

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
        // 获取payLoad中的u_id, u_loginName
        Object u_id = claims.get("u_id");
        Object u_loginName = claims.get("u_loginName");
        payLoadMap.put("u_id", u_id);
        payLoadMap.put("u_loginName", u_loginName);
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
