package org.bff.javampd.player;

import org.bff.javampd.server.MPDResponseException;

/**
 * Represents an error with the MPDPlayer.
 *
 * @author Bill
 * @version 1.0
 */
public class MPDPlayerException extends MPDResponseException {

    /**
     * Constructor.
     */
    public MPDPlayerException(String message) {
        super(message);
    }

    /**
     * Class constructor specifying the message and command generating the
     * error.
     *
     * @param message the exception message
     * @param command the command generating the exception
     * @param cause   the cause of the exception
     */
    public MPDPlayerException(String message, String command, Throwable cause) {
        super(message, command, cause);
    }

    /**
     * Class constructor specifying the cause.
     *
     * @param cause the cause of this exception
     */
    public MPDPlayerException(Throwable cause) {
        super(cause);
    }

    /**
     * Class constructor specifying the message and cause.
     *
     * @param message the exception message
     * @param cause   the cause of this exception
     */
    public MPDPlayerException(String message, Throwable cause) {
        super(message, cause);
    }

}
