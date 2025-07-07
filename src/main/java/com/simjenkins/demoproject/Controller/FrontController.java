package com.simjenkins.demoproject.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class FrontController {


    @GetMapping("/getHome")
    public ResponseEntity<SercretMessage> getMethodName() {
        SercretMessage sc=new SercretMessage("Welcome to home",HttpStatus.OK.value());
        return ResponseEntity.ok().body(sc);
    }


    public class SercretMessage
    {

        private String message;
        private Integer statusCode;

        public SercretMessage(String message,Integer statusCode)
        {
            this.message=message+" :v1";
            this.statusCode=statusCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public void setStatusCode(Integer statusCode) {
            this.statusCode = statusCode;
        }

        public Integer getStatusCode() {
            return statusCode;
        }

        @Override
        public String toString() {
            return "SercretMessage [message is =" + message + ", statusCode=" + statusCode + "]";
        }

    }

}



