package io.jongyun.awss3service.dto.result;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {

    // S3
    UPLOAD_SUCCESS(200, "S001", "업로드 성공"),
    ;

    private final int status;
    private final String code;
    private final String message;
}
