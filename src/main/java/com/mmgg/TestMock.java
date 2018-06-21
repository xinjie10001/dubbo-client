package com.mmgg;

public class TestMock implements UserService {
    @Override
    public String getUser() {
        return "系统繁忙，请稍后再试...";
    }
}
