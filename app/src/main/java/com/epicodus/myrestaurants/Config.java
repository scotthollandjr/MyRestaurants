package com.epicodus.myrestaurants;

/**
 * Created by Guest on 6/28/16.
 */
public @interface Config {
    Class<BuildConfig> constants();

    int sdk();
}
