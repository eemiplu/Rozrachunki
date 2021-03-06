package com.example.rozrachunki.remote;

import com.example.rozrachunki.services.FriendshipService;
import com.example.rozrachunki.services.GroupService;
import com.example.rozrachunki.services.PaymentService;
import com.example.rozrachunki.services.UserService;

public class ApiUtils {

    public static final String BASE_URL="http://192.168.2.3:9090/";

    public static UserService getUserService(){
        return RetrofitClient.getClient(BASE_URL).create(UserService.class);
    }

    public static FriendshipService getFriendshipService(){
        return RetrofitClient.getClient(BASE_URL).create(FriendshipService.class);
    }

    public static GroupService getGroupService(){
        return RetrofitClient.getClient(BASE_URL).create(GroupService.class);
    }

    public static PaymentService getPaymentService(){
        return RetrofitClient.getClient(BASE_URL).create(PaymentService.class);
    }
}
