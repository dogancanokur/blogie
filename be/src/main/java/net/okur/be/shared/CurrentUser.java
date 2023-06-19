package net.okur.be.shared;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author dogancan.okur 20.06.2023 01:24
 */
@Target({ PARAMETER })
@Retention(RUNTIME)
public @interface CurrentUser {
}
