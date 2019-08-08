package net.shavedog.admin.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice     //使用Rest风格就表示返回的数据类型为JSON
public class GlobalExceptionHander {
    @ExceptionHandler(Exception.class)
    public Object defaultErrorHander(HttpServletRequest request,Exception e){
        Map<String,Object> result = new HashMap<>();
        result.put("code", HttpStatus.INTERNAL_SERVER_ERROR);
        result.put("url",request.getRequestURL());
        result.put("exception",e.getMessage());
        return  result;
    }
}
