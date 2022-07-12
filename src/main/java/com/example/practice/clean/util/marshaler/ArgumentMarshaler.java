package com.example.practice.clean.util.marshaler;

import com.example.practice.clean.exception.ArgsException;

import java.util.Iterator;

public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;
}
