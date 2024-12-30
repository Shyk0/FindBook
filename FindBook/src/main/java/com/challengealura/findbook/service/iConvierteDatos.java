package com.challengealura.findbook.service;

public interface iConvierteDatos {
    <T> T convertirDatos(String json, Class<T> clase);
}
