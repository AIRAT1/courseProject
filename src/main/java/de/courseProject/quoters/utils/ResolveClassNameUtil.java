package de.courseProject.quoters.utils;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.type.classreading.MethodMetadataReadingVisitor;

import java.lang.reflect.Field;

public class ResolveClassNameUtil {
    public static String resolveClassNameFromJavaConfig(BeanDefinition beanDefinition) {
        try {
            Object reader = Class.forName("org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader");
            Field field = reader.getClass().getDeclaredField("factoryMethodMetadata");
            field.setAccessible(true);
            MethodMetadataReadingVisitor visitor = (MethodMetadataReadingVisitor) field.get(reader);
            return visitor.getReturnTypeName();
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
