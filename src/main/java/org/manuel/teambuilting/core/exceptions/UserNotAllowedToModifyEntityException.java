package org.manuel.teambuilting.core.exceptions;

import lombok.AllArgsConstructor;

/**
 * @author Manuel Doncel Martos
 * @since 17/04/2017.
 */
@AllArgsConstructor
public class UserNotAllowedToModifyEntityException extends RuntimeException {

    private final String message;

    public UserNotAllowedToModifyEntityException() {
        this("");
    }

}
