package com.dev.springrestdemo.controller.vi;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Kevin Neag
 */
public class AbstractRestControllerTest {

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
