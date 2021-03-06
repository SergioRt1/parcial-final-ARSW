package com.example.parcial.services;

import com.example.parcial.bean.Convertion;
import com.example.parcial.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertionServicesStub implements ConvertionServices{

    @Autowired
    Convertion convertion;

    @Override
    public Unit ConvertToCelsius(Float value) throws ConvertException {
        return convertion.ConvertToCelsius(value);
    }

    @Override
    public Unit ConvertToFahrenheit(Float value) throws ConvertException {
        return convertion.ConvertToFahrenheit(value);
    }
}
