package com.example.demo;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionTest {
        // MySQL Connector 의 클래스. DB 연결 드라이버 정의
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        // DB 경로
        private static final String URL = "jdbc:mysql://211.47.75.102:3306/dbyujinbike?serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
        private static final String USER = "yujinbike";
        private static final String PASSWORD = "qusdbfla0!";

        @Test
        public void testConnection() throws Exception {
            // DBMS에게 DB 연결 드라이버의 위치를 알려주기 위한 메소드
            Class.forName(DRIVER);
            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection Ok");
                System.out.println(connection);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }