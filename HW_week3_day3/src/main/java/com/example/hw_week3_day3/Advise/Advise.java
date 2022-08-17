package com.example.hw_week3_day3.Advise;

import com.example.hw_week3_day3.Exprection.EXP;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class Advise {

@ExceptionHandler(value = EXP.class)
    public ResponseEntity EXP(EXP exp) {
    return ResponseEntity.status(400).body(new Api(Api.getMessage(), 400));
}
}
