package com.yumumu.splitDataWeb.model.res;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

import java.io.Serializable;

@Data
public class ResponseData<T> implements Serializable {
    private static final long serialVersionUID = 2036232013174466847L;

    private static final Integer STATUS_SUCCESS = 1;
    private static final Integer STATUS_FAILED = 0;

    private static final Integer ERROR_CODE_DEFAULT = 100000;
    private static final Integer ERROR_CODE_SERVER_SIDE = 100002;

    private Integer status;
    private String errorMessage;
    private Integer errorCode;
    private T data;

    public static <T> ResponseData<T> success(T t) {
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setStatus(STATUS_SUCCESS);
        responseData.setErrorMessage(Strings.EMPTY);
        responseData.setErrorCode(ERROR_CODE_DEFAULT);
        responseData.setData(t);
        return responseData;
    }

    public static ResponseData failed(Integer errorCode, String errorMessage) {
        ResponseData responseData = new ResponseData();
        responseData.setStatus(STATUS_FAILED);
        responseData.setData(null);
        responseData.setErrorCode(errorCode);
        responseData.setErrorMessage(errorMessage);
        return responseData;
    }

    public static ResponseData failed(String errorMessage) {
        ResponseData responseData = new ResponseData();
        responseData.setStatus(STATUS_FAILED);
        responseData.setData(null);
        responseData.setErrorCode(ERROR_CODE_SERVER_SIDE);
        responseData.setErrorMessage(errorMessage);
        return responseData;
    }
}
