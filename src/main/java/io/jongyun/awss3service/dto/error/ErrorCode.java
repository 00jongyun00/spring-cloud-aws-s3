package io.jongyun.awss3service.dto.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author jongyunha created on 22. 3. 22.
 */
@Getter
@AllArgsConstructor
public enum ErrorCode {

    // Common
    INTERNAL_SERVER_ERROR(500, "ERROR_COMMON_C001", "내부 서버 오류입니다."),
    INVALID_INPUT_VALUE(400, "ERROR_COMMON_C002", "유효하지 않은 입력입니다."),
    METHOD_NOT_ALLOWED(405, "ERROR_COMMON_C003", "허용되지 않은 HTTP method 입니다."),
    INVALID_TYPE_VALUE(400, "ERROR_COMMON_C004", "입력 타입이 유효하지 않습니다."),

    // FILE
    CANT_CONVERT_FILE(500, "FI001", "파일을 변환할 수 없습니다."),

    ;

    private final int status;
    private final String code;
    private final String message;
}
