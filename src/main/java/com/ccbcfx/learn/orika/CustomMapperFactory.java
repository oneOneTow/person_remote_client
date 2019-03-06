package com.ccbcfx.learn.orika;


import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.converter.BidirectionalConverter;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Description:
 * @Author: 陆志庆
 * @CreateDate: 2019/3/6 14:02
 */
public class CustomMapperFactory {
    public static MapperFactory build() {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.getConverterFactory()
                .registerConverter(new LocalDateConverter());
        mapperFactory.getConverterFactory()
                .registerConverter(new LocalDateTimeConverter());
        mapperFactory.getConverterFactory()
                .registerConverter(new LocalTimeConverter());
        return mapperFactory;
    }

    private static class LocalDateTimeConverter extends BidirectionalConverter<LocalDateTime, LocalDateTime> {
        @Override
        public LocalDateTime convertTo(LocalDateTime source, Type<LocalDateTime> destinationType) {
            return LocalDateTime.from(source);
        }

        @Override
        public LocalDateTime convertFrom(LocalDateTime source, Type<LocalDateTime> destinationType) {
            return LocalDateTime.from(source);
        }
    }

    private static class LocalDateConverter extends BidirectionalConverter<LocalDate, LocalDate> {
        @Override
        public LocalDate convertTo(LocalDate source, Type<LocalDate> destinationType) {
            return LocalDate.from(source);
        }

        @Override
        public LocalDate convertFrom(LocalDate source, Type<LocalDate> destinationType) {
            return LocalDate.from(source);
        }
    }

    private static class LocalTimeConverter extends BidirectionalConverter<LocalTime, LocalTime> {
        @Override
        public LocalTime convertTo(LocalTime source, Type<LocalTime> destinationType) {
            return LocalTime.from(source);
        }

        @Override
        public LocalTime convertFrom(LocalTime source, Type<LocalTime> destinationType) {
            return LocalTime.from(source);
        }
    }

}
