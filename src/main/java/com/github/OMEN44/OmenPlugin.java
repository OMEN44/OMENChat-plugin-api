package com.github.OMEN44;

import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@Documented
@Target({ElementType.TYPE})
public @interface OmenPlugin {
    Class<?>[] value() default {void.class};
}
