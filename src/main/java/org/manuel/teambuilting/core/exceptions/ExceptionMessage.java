package org.manuel.teambuilting.core.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * @author manuel.doncel.martos
 * @since 13-1-2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@AllArgsConstructor
public class ExceptionMessage {

	private final HttpStatus status;

	private final String errorCode;

	private final String message;

	private final String detailedMessage;

}
