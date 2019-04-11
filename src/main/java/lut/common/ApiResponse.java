package lut.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponse<T> implements Serializable {

    public static final Integer OK = 200;
    public static final Integer ERROR = 400;
    public static final String SUCCUSS = "SUCCESS";
    public static final String FAILED = "FAILED";

    private Integer code;

    private String msg;

    private T data;

}
