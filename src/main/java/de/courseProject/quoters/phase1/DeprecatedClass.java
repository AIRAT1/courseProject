package de.courseProject.quoters.phase1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DeprecatedClass {
    Class newImpl();
}
