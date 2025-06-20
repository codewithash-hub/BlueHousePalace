package com.restaurant.model;

import jakarta.persistence.GenerationType;

public @interface GenerateValue {

    GenerationType strategy();

}
