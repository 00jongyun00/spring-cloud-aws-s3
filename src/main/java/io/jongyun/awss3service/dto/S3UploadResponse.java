package io.jongyun.awss3service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

/**
 * @author jongyunha created on 22. 4. 1.
 */
@Data
@Builder
@JsonInclude(Include.NON_NULL)
public class S3UploadResponse {


    @JsonProperty(value = "upload_image_url")
    private String uploadImageUrl;

}
