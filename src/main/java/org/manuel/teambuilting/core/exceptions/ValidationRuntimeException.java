package org.manuel.teambuilting.core.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author manuel.doncel.martos
 * @since 13-1-2017
 */
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class ValidationRuntimeException extends RuntimeException {

	@NotNull
	private final String errorCode;
	@NotNull
	private final String message;
	private String developerMessage;

	public ValidationRuntimeException(final ErrorCode errorCode, final Object... args) {
		this(errorCode.getErrorCode(), errorCode.getMessage(args));
	}

}
