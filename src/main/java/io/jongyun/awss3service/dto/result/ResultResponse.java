package io.jongyun.awss3service.dto.result;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;

/**
 * @author jongyunha created on 22. 3. 22.
 */

@Getter
@ApiModel(description = "Data model to response result")
@JsonInclude(Include.NON_NULL)
public class ResultResponse {

    @ApiModelProperty(value = "Http status code")
    private final int status;

    @ApiModelProperty(value = "Business status code")
    private final String code;

    @ApiModelProperty(value = "Response message")
    private final String message;

    @ApiModelProperty(value = "Response data")
    private final Object data;

    public static ResultResponse of(ResultCode resultCode, Object data) {
        return new ResultResponse(resultCode, data);
    }

    public ResultResponse(ResultCode resultCode, Object data) {
        this.status = resultCode.getStatus();
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.data = data;
    }
}
