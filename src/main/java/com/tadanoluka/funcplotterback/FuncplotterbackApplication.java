package com.tadanoluka.funcplotterback;

import com.tadanoluka.funcplotterback.security.JwtCore;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class FuncplotterbackApplication {

    private JwtCore jwtCore;
    @Autowired
    public void setJwtCore(JwtCore jwtCore) {
        this.jwtCore = jwtCore;
    }

    public static void main(String[] args) {
        SpringApplication.run(FuncplotterbackApplication.class, args);
    }

}
