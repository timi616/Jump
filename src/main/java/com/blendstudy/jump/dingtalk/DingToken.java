package com.blendstudy.jump.dingtalk;


import com.blendstudy.jump.config.DingKeySecret;
import com.dingtalk.api.DefaultDingTalkClient;
import com.dingtalk.api.DingTalkClient;
import com.dingtalk.api.request.OapiGettokenRequest;
import com.dingtalk.api.request.OapiUserGetRequest;
import com.dingtalk.api.response.OapiGettokenResponse;
import com.dingtalk.api.response.OapiUserGetResponse;
import com.taobao.api.ApiException;

public class DingToken {
    public static void main(String[] args) {
        try {
            DefaultDingTalkClient client = new DefaultDingTalkClient("https://oapi.dingtalk.com/gettoken");
            OapiGettokenRequest request = new OapiGettokenRequest();
            //DingKeySecret类中定义的APP_KEY变量
            request.setAppkey(DingKeySecret.APP_KEY);
            //DingKeySecret类中定义的APP_SECRET变量
            request.setAppsecret(DingKeySecret.APP_SECRET);
            request.setHttpMethod("GET");
            OapiGettokenResponse response = client.execute(request);
            String accessToken = response.getAccessToken();
            System.out.println("获取的token是:"+accessToken);
            if (accessToken != null&"".equals(accessToken)){
                try {
                    DingTalkClient clientUserInfo = new DefaultDingTalkClient("https://oapi.dingtalk.com/user/get");
                    OapiUserGetRequest req = new OapiUserGetRequest();
                    req.setHttpMethod("GET");
                    req.setUserid("1561079698454472"); //我的钉钉账号
                    OapiUserGetResponse rsp = clientUserInfo.execute(req, accessToken); //钉钉token
                    System.out.println(rsp.getBody());
                } catch (ApiException e) {
                    e.printStackTrace();
                }
            }
        } catch (ApiException e) {
            throw new RuntimeException();
        }

    }
}
