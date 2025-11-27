package utils;

import com.google.gson.Gson;


public interface BaseApi {
    String BASE_URL = "https://contactapp-telran-backend.herokuapp.com";
    String REGISTRATION = "/v1/user/registration/usernamepassword";
    String LOGIN = "/v1/user/login/usernamepassword";
    String ADD_NEW_CONTACT = "/v1/contacts";
    String GET = "/v1/contacts";
    String PUT = "/v1/contacts";
    String DELETE = "/v1/contacts/{id}";
    //String GET_USER_CARS = "/v1/cars/my";

    Gson GSON = new Gson();

    String AUTH = "Authorization";
}
