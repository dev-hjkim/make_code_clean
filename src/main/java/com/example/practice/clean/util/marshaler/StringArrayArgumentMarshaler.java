package com.example.practice.clean.util.marshaler;

import com.example.practice.clean.exception.ArgsException;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.example.practice.clean.exception.ArgsException.ErrorCode.*;


public class StringArrayArgumentMarshaler implements ArgumentMarshaler {
    private String[] stringArrayValue;
    public void set(Iterator<String> currentArgument) throws ArgsException {
        String parameter = null;
        try {
            parameter = currentArgument.next();
            stringArrayValue = parameter.split(",");
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING_ARRAY);
        }
    }

    public static String[] getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler)
            return ((StringArrayArgumentMarshaler) am).stringArrayValue;
        else
            return new String[0];
    }
}
