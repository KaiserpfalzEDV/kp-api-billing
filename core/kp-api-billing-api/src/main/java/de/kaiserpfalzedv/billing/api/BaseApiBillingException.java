/*
 * Copyright (c) 2023. Roland T. Lichti, Kaiserpfalz EDV-Service.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.kaiserpfalzedv.billing.api;

import de.kaiserpfalzedv.commons.core.api.BaseException;

/**
 * BaseApiBillingException --
 *
 * @author klenkes74 {@literal <rlichti@kaiserpfalz-edv.de>}
 * @since 1.0.0  2023-01-18
 */
public class BaseApiBillingException extends BaseException {

    public BaseApiBillingException(String message) {
        super(message);
    }

    public BaseApiBillingException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseApiBillingException(Throwable cause) {
        super(cause);
    }

    public BaseApiBillingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
