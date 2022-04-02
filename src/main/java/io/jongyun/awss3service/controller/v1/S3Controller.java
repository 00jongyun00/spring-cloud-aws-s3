package io.jongyun.awss3service.controller.v1;

import io.jongyun.awss3service.dto.S3UploadResponse;
import io.jongyun.awss3service.service.S3Uploader;
import lombok.RequiredArgsConstructor;
import io.jongyun.awss3service.dto.result.ResultCode;
import io.jongyun.awss3service.dto.result.ResultResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author jongyunha created on 22. 3. 23.
 */
@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class S3Controller {

    private final S3Uploader s3Uploader;

    @PostMapping("/upload")
    public ResponseEntity<ResultResponse> upload(
        @RequestParam("images") MultipartFile multipartFile) throws IOException {
        String uploadImage = s3Uploader.upload(multipartFile, "static");
        S3UploadResponse uploadResponse = S3UploadResponse.builder()
            .uploadImageUrl(uploadImage)
            .build();

        ResultResponse result = ResultResponse.of(ResultCode.UPLOAD_SUCCESS, uploadResponse);
        return new ResponseEntity<>(result, HttpStatus.valueOf(result.getStatus()));
    }
}
