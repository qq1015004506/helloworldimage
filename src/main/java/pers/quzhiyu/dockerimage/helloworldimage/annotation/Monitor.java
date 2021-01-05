package pers.quzhiyu.dockerimage.helloworldimage.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Component
@Target(value = {ElementType.METHOD, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Monitor {
}